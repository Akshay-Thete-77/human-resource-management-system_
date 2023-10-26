package com.te.hrms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.hrms.entity.LeaveRequest;
import com.te.hrms.repository.LeaveRequestRepository;
import com.te.hrms.service.LeaveRequestService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaveRequestServiceImpl implements LeaveRequestService {

	private final LeaveRequestRepository leaveRequestRepository;

	@Override
	public List<LeaveRequest> getLeaveRequests() {
		List<LeaveRequest> leaveRequests = leaveRequestRepository.findAll();
		return leaveRequests;
	}

	@Override
	public Optional<LeaveRequest> getLeaveRequest(String id) {
		Optional<LeaveRequest> IdOp = leaveRequestRepository.findById(id);
		return IdOp;
	}

}
