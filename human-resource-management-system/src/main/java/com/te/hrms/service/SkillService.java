package com.te.hrms.service;

import java.util.List;
import java.util.Optional;

import com.te.hrms.entity.LeaveRequest;
import com.te.hrms.entity.Skill;

public interface SkillService {

	List<Skill> getLeaveRequests();

	Optional<Skill> getLeaveRequest(String id);

}
