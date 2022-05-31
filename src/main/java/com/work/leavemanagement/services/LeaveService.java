package com.work.leavemanagement.services;

import com.work.leavemanagement.dto.SearchDto;
import com.work.leavemanagement.dto.TestLeaveDto;
import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.request.LeaveRequest;
import com.work.leavemanagement.response.LeaveResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface LeaveService {

    List<Leave> getAll();

    String save(LeaveRequest leaveRequest);

    LeaveResponse findById(Long id);

    boolean update(LeaveRequest leaveRequest);

    void deleteById(UUID uuid);

    List<Leave> search(SearchDto searchDto);
}
