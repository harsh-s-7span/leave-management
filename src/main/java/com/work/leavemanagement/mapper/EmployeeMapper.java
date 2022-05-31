package com.work.leavemanagement.mapper;

import com.work.leavemanagement.entities.Address;
import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.request.AddressRequest;
import com.work.leavemanagement.request.EmployeeRequest;
import com.work.leavemanagement.response.AddressResponse;
import com.work.leavemanagement.response.EmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "uuid", ignore = true)
    Employee employeeRequestToEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse employeeToEmployeeResponse(Employee employee);

    List<Address> addressRequestToAddress(List<AddressRequest> addressRequests);

    List<AddressResponse> addressToAddressResponse(List<Address> addresses);
}
