package com.te.hrms.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

@AllArgsConstructor
@Getter
@Setter
@Builder
@Table
public class LeaveRequest {

	@Id
	private String leaveRequestID;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "leaveRequests")
	private List<Employee> employees=new ArrayList();
	private LocalDate startDate;
	private LocalDate endDate;
	private String leaveType;
	private LeaveStatus leaveStatus;

}
