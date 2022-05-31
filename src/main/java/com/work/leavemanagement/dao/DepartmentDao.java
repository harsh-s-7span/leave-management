package com.work.leavemanagement.dao;

import com.work.leavemanagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department, Long> {
}
