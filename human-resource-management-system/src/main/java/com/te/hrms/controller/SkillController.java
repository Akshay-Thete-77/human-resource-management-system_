package com.te.hrms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.hrms.entity.LeaveRequest;
import com.te.hrms.entity.Skill;
import com.te.hrms.response.SuccessResponse;
import com.te.hrms.service.SkillService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/skills")
@RequiredArgsConstructor
public class SkillController {

	private final SkillService SkillService;

	@GetMapping("/")
	public ResponseEntity<SuccessResponse> getLeaveRequests() {
		List<Skill> leaveRequests = SkillService.getLeaveRequests();
		return ResponseEntity.<SuccessResponse>ok()
				.body(SuccessResponse.builder().data(leaveRequests).message("leave requests provided").build());
	}

	@GetMapping("/{id}`")
	public ResponseEntity<SuccessResponse> getLeaveRequest(@PathVariable String id) {
		Skill leaveRequest = SkillService.getLeaveRequest(id)
				.orElseThrow(() -> new RuntimeException("leaveRequest notfound...!!"));
		return ResponseEntity
				.<SuccessResponse>ok(SuccessResponse.builder().data(leaveRequest).message("data provided").build());
	}
}
