package com.te.hrms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.te.hrms.entity.Employee;
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
public class EmployeeDTO {
	private String employeeID;
	private String emplpoyeefirstName;
	private String emplpoyeeLastName;
	private String emplpoyeeEmail;
	private String emplpoyeeContact;
	private String JoiningDate;
	private String Department;
	private String employeeDesignation;
	private List<LeaveRequest> leaveRequests;
	private List<PerformanceReview> performanceReviews;
	private Skill skills;
	private List<TrainingProgram> trainingPrograms;
	private String password;
}
