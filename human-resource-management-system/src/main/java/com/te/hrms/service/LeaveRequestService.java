package com.te.hrms.service;

import java.util.List;
import java.util.Optional;

import com.te.hrms.entity.LeaveRequest;

public interface LeaveRequestService {

	List<LeaveRequest> getLeaveRequests();

	Optional<LeaveRequest> getLeaveRequest(String id);

}
