package verifier.constant;

public enum ItemStatus {

    ALL(0, "All"), PENDING(1, "Pending"), IN_PROGRESS(2, "In Progress"), SUCCESS(3, "Archived"), FAIL(4, "Failed"), DELETED(5, "Deleted");

    private int code;

    private String name;

    ItemStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ItemStatus getByCode(int code) {
        for (ItemStatus itemStatus : ItemStatus.values()) {
            if (itemStatus.getCode() == code) {
                return itemStatus;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
