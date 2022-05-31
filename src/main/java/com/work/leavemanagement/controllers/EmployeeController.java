package com.work.leavemanagement.controllers;

import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.request.EmployeeRequest;
import com.work.leavemanagement.response.EmployeeResponse;
import com.work.leavemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public @ResponseBody List<EmployeeResponse> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getById(@PathVariable("id") Long id){
        return employeeService.getById(id);
    }

    @PostMapping
    public String save(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.save(employeeRequest);
    }

    @PutMapping
    public boolean update(EmployeeRequest employeeRequest){
        return employeeService.update(employeeRequest);
    }

    @DeleteMapping
    public void deleteById(Long id){
        employeeService.deleteById(id);
    }
}
