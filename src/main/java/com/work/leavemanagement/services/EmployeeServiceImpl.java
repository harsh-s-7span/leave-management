package com.work.leavemanagement.services;

import com.work.leavemanagement.dao.EmployeeDao;
import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.mapper.EmployeeMapper;
import com.work.leavemanagement.request.EmployeeRequest;
import com.work.leavemanagement.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeResponse> getAll() {
        List<Employee> list = employeeDao.findAll();
        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        for (Employee employee : list) {
            EmployeeResponse employeeResponse = employeeMapper.employeeToEmployeeResponse(employee);
           // employeeResponse.setAddressResponses(employeeMapper.addressToAddressResponse(employee.getAddress()));
            employeeResponses.add(employeeResponse);
        }

        return employeeResponses;
    }

    @Override
    public EmployeeResponse getById(Long id) {
        return employeeMapper.employeeToEmployeeResponse(employeeDao.findById(id).get());
    }

    @Override
    public String save(EmployeeRequest employeeRequest) {
        Employee employee = employeeMapper.employeeRequestToEmployee(employeeRequest);
        employee.setAddress(employeeMapper.addressRequestToAddress(employeeRequest.getAddressRequests()));

        if(employeeDao.save(employee) != null)
            return "Employee Saved Successfully...";

        return "Something went wrong...";
    }

    @Override
    public boolean update(EmployeeRequest employee) {
        if(employeeDao.save(employeeMapper.employeeRequestToEmployee(employee)) != null)
            return true;

        return false;
    }

    @Override
    public void deleteById(Long id) {
        employeeDao.deleteById(id);
    }
}
