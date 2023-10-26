package com.te.hrms.service;

import java.util.List;
import java.util.Optional;

import com.te.hrms.dto.EmployeeDTO;
import com.te.hrms.entity.Employee;

public interface EmployeeService {

	Optional<String> registerEmployee(EmployeeDTO employeeDTO);

	List<Employee> getEmployees();

	Optional<Employee> getEmployee(String id);

}
