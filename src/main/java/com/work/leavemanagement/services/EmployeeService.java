package com.work.leavemanagement.services;

import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.request.EmployeeRequest;
import com.work.leavemanagement.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> getAll();
    EmployeeResponse getById(Long id);
    String save(EmployeeRequest employee);
    boolean update(EmployeeRequest employee);
    void deleteById(Long id);
}
