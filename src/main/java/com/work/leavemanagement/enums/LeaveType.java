package com.work.leavemanagement.enums;

public enum LeaveType {
    CASUAL_LEAVE(1, "CASUAL_LEAVE", "Casual Leave"),
    SICK_LEAVE(2, "SICK_LEAVE", "Sick Leave"),
    FESTIVAL_LEAVE(3, "FESTIVAL_LEAVE", "Festival Leave");

    private int id;
    private String name;
    private String value;

    LeaveType(int id, String name, String value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
