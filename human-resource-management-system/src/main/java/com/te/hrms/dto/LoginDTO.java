package com.te.hrms.dto;

import java.util.List;

import com.te.hrms.entity.LeaveRequest;
import com.te.hrms.entity.PerformanceReview;
import com.te.hrms.entity.Skill;
import com.te.hrms.entity.TrainingProgram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginDTO {
	private String username;
	private String password;
}
