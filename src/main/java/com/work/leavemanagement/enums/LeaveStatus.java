package com.work.leavemanagement.enums;

public enum LeaveStatus {
    PENDING_APPROVAL(1, "PENDING_APPROVAL", "Pending Approval"),
    APPROVAL(2, "APPROVAL", "Approval"),
    REJECTED(3, "REJECTED", "Rejected"),
    CANCELLED(4, "CANCELLED", "Cancelled");

    public int id;
    public String name;
    public String value;

    LeaveStatus(int id, String name, String value){
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
