package verifier.thirdparty;

import verifier.constant.StorageConstant;
import verifier.constant.StorageType;
import verifier.entity.Item;
import verifier.entity.Line;

public abstract class AbstractApiService {
    public abstract void doVerify(Line line);

    public abstract StorageConstant getStorageType();
}
