package com.work.leavemanagement;

import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.repos.LeaveRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
class LeaveManagementApplicationTests {

	@Autowired
	LeaveRepository leaveRepository;

	@Test
	void contextLoads() {
	}
	@Test
	void testCreate(){
		Leave leave = new Leave();
		leave.setId(1);
		leave.setType("Sick Leave");
		leave.setFromDate(new Date(System.currentTimeMillis()));
		leave.setToDate(new Date(System.currentTimeMillis()));
		leave.setDuration(1d);
		leave.setLeaveSpan("Full Day");
		leave.setAvailableLeaves(5d);
		leave.setApplyDate(new Date(System.currentTimeMillis()));
		leave.setStatus("Pending Approval");
		leave.setUserId(1);

		leaveRepository.save(leave);
	}
}
