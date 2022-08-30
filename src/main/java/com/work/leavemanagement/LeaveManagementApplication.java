package com.work.leavemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories(basePackages = "com.work.leavemanagement.dao")
@EnableAspectJAutoProxy
@EnableSwagger2
@SpringBootApplication
public class LeaveManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementApplication.class, args);
	}
}