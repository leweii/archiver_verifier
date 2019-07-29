package verifier.thirdparty;

import verifier.constant.StorageType;
import verifier.entity.Item;

public abstract class AbstractApiService {
    public abstract void doVerify(Item items);

    public abstract StorageType getStorageType();
}
