package verifier.constant;

public enum DirectionType {

    ALL(0, "All"), INBOUND(1, "Inbound"), OUTBOUND(2, "Outbound");


    private int code;
    private String name;

    DirectionType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static DirectionType getByCode(int code) {
        for (DirectionType directionType : DirectionType.values()) {
            if (directionType.getCode() == code) {
                return directionType;
            }
        }
        return ALL;
    }

    public static DirectionType getByName(String name) {
        for (DirectionType directionType : DirectionType.values()) {
            if (directionType.getName().equals(name)) {
                return directionType;
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
