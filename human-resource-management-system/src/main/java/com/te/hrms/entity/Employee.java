package com.te.hrms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
@Table
public class Employee {

	@Id
	private String employeeID;
	private String emplpoyeefirstName;
	private String emplpoyeeLastName;
	private String emplpoyeeEmail;
	private String emplpoyeeContact;
	private String JoiningDate;
	private String Department;
	private String employeeDesignation;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<LeaveRequest> leaveRequests;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<PerformanceReview> performanceReviews;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Skill> skills = new ArrayList();
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<TrainingProgram> trainingPrograms = new ArrayList();

}
