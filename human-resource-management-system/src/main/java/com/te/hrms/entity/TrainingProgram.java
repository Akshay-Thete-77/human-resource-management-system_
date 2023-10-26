package com.te.hrms.entity;

import java.time.LocalDate;
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
public class TrainingProgram {

	@Id
	private String programID;
	private String programName;
	private String programDescription;
	private LocalDate startDate;
	private LocalDate endDate;
	private String JoiningDate;
	private String Department;
	private String employeeDesignation;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "trainingPrograms")
	private List<Employee> employees = new ArrayList();
}
