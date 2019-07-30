package verifier.thirdparty;

import org.springframework.stereotype.Service;
import verifier.constant.StorageConstant;
import verifier.entity.Line;

@Service
public class DropboxApiService extends AbstractApiService {

    @Override
    public void doVerify(Line line) {

    }

    @Override
    public StorageConstant getStorageType() {
        return StorageConstant.DROPBOX;
    }
}
