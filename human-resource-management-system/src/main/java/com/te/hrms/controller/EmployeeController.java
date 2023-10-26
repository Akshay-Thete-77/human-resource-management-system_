package com.te.hrms.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.hrms.entity.Employee;
import com.te.hrms.response.SuccessResponse;
import com.te.hrms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;

	@GetMapping("/")
	public ResponseEntity<SuccessResponse> getEmployees() {
		List<Employee> employees = employeeService.getEmployees();
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(employees)
				.message("Empyee data prvided").timestamp(LocalDateTime.now()).build());
	}

	@GetMapping("/{id}")
	public ResponseEntity<SuccessResponse> getEmployee(@PathVariable String id) {
		Employee employee = employeeService.getEmployee(id)
				.orElseThrow(() -> new RuntimeException("employee not found...!!"));
		return ResponseEntity.<SuccessResponse>ok()
				.body(SuccessResponse.builder().data(employee).message("Employee data provided").build());
	}

}
