package com.work.leavemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.work.leavemanagement.dao")
@SpringBootApplication
public class LeaveManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementApplication.class, args);
	}
}