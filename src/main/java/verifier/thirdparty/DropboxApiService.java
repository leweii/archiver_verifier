package verifier.thirdparty;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.*;
import org.springframework.stereotype.Service;
import verifier.constant.StorageConstant;
import verifier.entity.Extension;
import verifier.entity.Line;

//https://dropbox.github.io/dropbox-api-v2-explorer/
@Service
public class DropboxApiService extends AbstractApiService {

    @Override
    public void doVerify(Line line) {
        DbxRequestConfig config = new DbxRequestConfig("DropBox PoC");
        DbxClientV2 client = new DbxClientV2(config, user.getAccessToken());

        DbxUserFilesRequests requests = client.files();
        for (Extension extension : line.getExtensions()) {
            Long count = 0L;
            String path = "/ringcentral archiver/" + extension.getFirstName() + " " + extension.getLastName()
                    + "_" + extension.getExtensionNum();
            ListFolderBuilder builder = requests.listFolderBuilder(path)
                    .withRecursive(true);
            ListFolderResult results = builder.start();

            while (!results.getEntries().isEmpty()) {
                for (Metadata metadata : results.getEntries()) {
                    if (metadata instanceof FileMetadata) {
                        count++;
                    }
                }
                if (!results.getHasMore()) {
                    break;
                }
                results = client.files().listFolderContinue(results.getCursor());
            }
        }

    }

    @Override
    public StorageConstant getStorageType() {
        return StorageConstant.DROPBOX;
    }
}
