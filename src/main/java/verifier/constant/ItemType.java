package verifier.constant;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ItemType {

    ALL(0, "All"),
    FAX(1, "Fax"),
    SMS(2, "SMS"),
    VOICEMAIL(3, "Voicemail"),
    CALLRECORDING(4, "Call Recording"),
    CALLLIST(5, "CallList"),
    MESSAGELIST(6, "MessageList"),
    CLOUD_RECORDING_LIST(7, "CloudRecordingList"),
    CLOUD_RECORDING(8, "CloudRecording");

    private int code;
    private String name;

    ItemType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ItemType getByCode(int code) {
        for (ItemType itemType : ItemType.values()) {
            if (itemType.getCode() == code) {
                return itemType;
            }
        }
        return ALL;
    }

    public static ItemType getByName(String name) {
        for (ItemType itemType : ItemType.values()) {
            if (itemType.getName().equalsIgnoreCase(name)) {
                return itemType;
            }
        }
        return ALL;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
