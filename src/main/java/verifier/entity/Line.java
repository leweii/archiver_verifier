package verifier.entity;

import verifier.constant.StorageConstant;

import java.util.List;

public class Line {
    private Long ownerId;
    private List<Extension> extensions;
    private StorageConstant storageType;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public StorageConstant getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageConstant storageType) {
        this.storageType = storageType;
    }
}
