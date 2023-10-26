package com.te.hrms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.hrms.entity.LeaveRequest;
import com.te.hrms.entity.Skill;
import com.te.hrms.repository.SkillServiceRepository;
import com.te.hrms.service.SkillService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService{

	private SkillServiceRepository skillServiceRepository;
	@Override
	public List<Skill> getLeaveRequests() {
		return null;
	}
	@Override
	public Optional<Skill> getLeaveRequest(String id) {
		return skillServiceRepository.findById(id);
	}

}
