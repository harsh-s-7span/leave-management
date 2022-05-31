package com.work.leavemanagement.dao.custom;

import com.work.leavemanagement.dto.SearchDto;
import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.entities.Leave;

import java.util.List;
import java.util.Set;

public interface CustomLeaveDao {

    List<Leave> searchLeave(SearchDto searchDto, Employee employee);
}
