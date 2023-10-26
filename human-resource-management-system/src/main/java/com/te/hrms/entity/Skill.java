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
public class Skill {
	@Id
	private String skillID;
	private String skillName;
	private String skillDescription;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "skill")
	private List<Employee> employees = new ArrayList();
}
