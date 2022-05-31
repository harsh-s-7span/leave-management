package com.work.leavemanagement.mapper;

import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.request.LeaveRequest;
import com.work.leavemanagement.response.LeaveResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LeaveMapper {

    @Mapping(target = "uuid", ignore = true)
    @Mapping(source = "employee",target = "employee")
    Leave leaveRequestToLeave(LeaveRequest leaveRequest);


    LeaveRequest leaveToLeaveRequest(Leave leave);

    LeaveResponse leaveToLeaveResponse(Leave leave);
}
