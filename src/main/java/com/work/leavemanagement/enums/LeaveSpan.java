package com.work.leavemanagement.enums;

public enum LeaveSpan {
    FULL_DAY(1, "FULL_DAY", "Full Day"),
    FIRST_HALF(2, "FIRST_HALF", "First Half"),
    SECOND_HALF(3, "SECOND_HALF", "Second Half");

    public int id;
    public String name;
    public String value;

    LeaveSpan(int id, String name, String value){
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
