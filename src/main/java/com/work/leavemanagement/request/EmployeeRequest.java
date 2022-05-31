package com.work.leavemanagement.request;

import com.work.leavemanagement.entities.Address;
import com.work.leavemanagement.entities.Department;

import java.util.List;
import java.util.UUID;

public class EmployeeRequest {

    private Long id;

    private UUID uuid;

    private String name;

    private String designation;

    private Float salary;

    private Float experience;

    private Department department;

    private List<AddressRequest> addressRequests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getExperience() {
        return experience;
    }

    public void setExperience(Float experience) {
        this.experience = experience;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<AddressRequest> getAddressRequests() {
        return addressRequests;
    }

    public void setAddressRequests(List<AddressRequest> addressRequests) {
        this.addressRequests = addressRequests;
    }
}
