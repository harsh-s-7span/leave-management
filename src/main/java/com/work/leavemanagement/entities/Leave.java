package com.work.leavemanagement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.work.leavemanagement.enums.LeaveSpan;
import com.work.leavemanagement.enums.LeaveStatus;
import com.work.leavemanagement.enums.LeaveType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table (name = "leaves", schema = "leave_management")
public class Leave {

    @Column(name = "x_id", updatable = false, columnDefinition = "Binary(16)")
    private final UUID uuid = UUID.randomUUID();

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private LeaveType type;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "duration")
    private Float duration;

    @Column(name = "leave_span")
    @Enumerated(EnumType.STRING)
    private LeaveSpan leaveSpan;

    @Column(name = "available_leaves")
    private Float availableLeaves;

    @Column(name = "apply_date")
    private LocalDate applyDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Employee employee;

    public UUID getUuid() {
        return uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LeaveType getType() {
        return type;
    }

    public void setType(LeaveType type) {
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

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public LeaveSpan getLeaveSpan() {
        return leaveSpan;
    }

    public void setLeaveSpan(LeaveSpan leaveSpan) {
        this.leaveSpan = leaveSpan;
    }

    public Float getAvailableLeaves() {
        return availableLeaves;
    }

    public void setAvailableLeaves(Float availableLeaves) {
        this.availableLeaves = availableLeaves;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // @JsonBackReference
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "uuid=" + uuid +
                ", id=" + id +
                ", type=" + type +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", duration=" + duration +
                ", leaveSpan=" + leaveSpan +
                ", availableLeaves=" + availableLeaves +
                ", applyDate=" + applyDate +
                ", status=" + status +
                ", userId=" + userId +
                ", employee=" + employee +
                '}';
    }
}
