package com.te.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, String> {

	List<LeaveRequest> findAll();

}
