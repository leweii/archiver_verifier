package verifier.thirdparty;

import org.springframework.stereotype.Service;
import verifier.constant.StorageType;
import verifier.entity.Item;

@Service
public class BoxApiService extends AbstractApiService {

    @Override
    public void doVerify(Item items) {

    }

    @Override
    public StorageType getStorageType() {
        return StorageType.BOX;
    }
}
