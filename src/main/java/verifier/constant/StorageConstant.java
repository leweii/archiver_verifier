package verifier.constant;

/**
 * Created by winston.xie on 10/11/2016 AD.
 */

public enum StorageConstant {

    EMPTY(0, StorageType.NONE, "", ""),
    DROPBOX(1, StorageType.CLOUD, "Dropbox", "dropbox"),
    SFTP(2, StorageType.SFTP, "SFTP", "sftp"),
    DRIVE(3, StorageType.CLOUD, "Google Drive", "drive"),
    BOX(4, StorageType.CLOUD, "Box", "box"),
    SALESFORCE(5, StorageType.CLOUD, "Salesforce", "salesforce");


    private final int storageId;
    private final StorageType type;
    private final String name;
    private final String code;

    StorageConstant(int storageId, StorageType type, String name, String code) {
        this.storageId = storageId;
        this.type = type;
        this.name = name;
        this.code = code;
    }

    public static StorageConstant getById(int storageId) {
        for (StorageConstant storageConst : StorageConstant.values()) {
            if (storageConst.getStorageId() == storageId) {
                return storageConst;
            }
        }
        return EMPTY;
    }

    public static StorageType getStorageType(int storageId) {
        return getById(storageId).getStorageType();
    }

    // @JsonValue
    public int getStorageId() {
        return storageId;
    }

    public StorageType getStorageType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
