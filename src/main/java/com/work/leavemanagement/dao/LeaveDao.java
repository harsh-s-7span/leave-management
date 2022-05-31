package com.work.leavemanagement.dao;


import com.work.leavemanagement.dao.custom.CustomLeaveDao;
import com.work.leavemanagement.dto.TestLeaveDto;
import com.work.leavemanagement.entities.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LeaveDao extends JpaRepository<Leave, Long> , CustomLeaveDao {
    Leave findByUuid(UUID uuid);
    void deleteByUuid(UUID uuid);

    @Query(value = "select * from leaves", nativeQuery = true)
    List<Leave> findAllLeaves();

    @Query(value = "from Leave")
    List<Leave> findAllLeavesJpql();

    @Query(value = "from Leave where employee.id = :id")
    List<Leave> findLeaveByEmployee(@Param("id") Long id);
}
