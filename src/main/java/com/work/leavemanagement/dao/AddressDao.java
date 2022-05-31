package com.work.leavemanagement.dao;

import com.work.leavemanagement.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Long> {
}
