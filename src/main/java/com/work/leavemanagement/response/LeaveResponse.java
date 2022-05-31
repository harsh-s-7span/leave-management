package com.work.leavemanagement.response;

import com.work.leavemanagement.entities.Employee;

import java.time.LocalDate;
import java.util.UUID;

public class LeaveResponse {

    private UUID uuid;

    private Long id;

    private String type;

    private LocalDate fromDate;

    private LocalDate toDate;

    private Double duration;

    private String leaveSpan;

    private Double availableLeaves;

    private LocalDate applyDate;

    private String status;

    // private Employee employee;

    private Long userId;

    public Long getId() { return id;}

    public void setId(Long id) {this.id = id;}

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getLeaveSpan() {
        return leaveSpan;
    }

    public void setLeaveSpan(String leaveSpan) {
        this.leaveSpan = leaveSpan;
    }

    public Double getAvailableLeaves() {
        return availableLeaves;
    }

    public void setAvailableLeaves(Double availableLeaves) {
        this.availableLeaves = availableLeaves;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
