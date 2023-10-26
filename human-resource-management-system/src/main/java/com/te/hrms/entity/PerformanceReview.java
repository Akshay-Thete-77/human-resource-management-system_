package com.te.hrms.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.te.hrms.constant.LeaveStatus;

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
public class PerformanceReview {

	@Id
	private String reviewID;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "performanceReviews")
	private List<Employee> employees=new ArrayList();
	private LocalDate reviewDate;
	private String reviewerName;
	private String reviewerComments;
	private int Rating;
}
