package com.work.leavemanagement.services;

import com.work.leavemanagement.dao.EmployeeDao;
import com.work.leavemanagement.dao.LeaveDao;
import com.work.leavemanagement.dto.SearchDto;
import com.work.leavemanagement.dto.TestLeaveDto;
import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.mapper.LeaveMapper;
import com.work.leavemanagement.request.LeaveRequest;
import com.work.leavemanagement.response.EmployeeResponse;
import com.work.leavemanagement.response.LeaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.*;

@Service
@Transactional
public class LeaveServiceImpl implements LeaveService{

    @Autowired
    private LeaveDao leaveDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    public LeaveMapper leaveMapper;

    @Override
    public List<Leave> getAll() {
        return leaveDao.findAllLeavesJpql();
    }

    @Override
    public String save(LeaveRequest leaveRequest) {
        Leave leave = leaveMapper.leaveRequestToLeave(leaveRequest);

        if(leaveDao.save(leave)!= null)
            return "Leave Saved Successfully...";

        return "Something went wrong..";
    }

    @Override
    public LeaveResponse findById(Long id) {
        return leaveMapper.leaveToLeaveResponse(leaveDao.findById(id).get());
    }

    @Override
    public boolean update(LeaveRequest leaveRequest) {
        Leave leave = leaveMapper.leaveRequestToLeave(leaveRequest);
        if(leaveDao.save(leave)!= null)
            return true;

        return false;
    }

    @Override
    public void deleteById(UUID uuid) {
        leaveDao.deleteByUuid(uuid);
    }

    @Override
    public List<Leave> search(SearchDto searchDto) {

       // return leaveDao.findLeaveByEmployee(searchDto.getEmpId());
        Employee employee = employeeDao.findById(searchDto.getEmpId()).get();
        return leaveDao.searchLeave(searchDto, employee);
    }
}
