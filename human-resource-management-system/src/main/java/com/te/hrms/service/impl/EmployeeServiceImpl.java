package com.te.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.te.hrms.dto.EmployeeDTO;
import com.te.hrms.entity.AppUser;
import com.te.hrms.entity.Employee;
import com.te.hrms.entity.Roles;
import com.te.hrms.repository.AppUserRepository;
import com.te.hrms.repository.EmployeeRespository;
import com.te.hrms.repository.RoleRespository;
import com.te.hrms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRespository employeeRespository;
	private final RoleRespository RoleRespository;
	private final PasswordEncoder passwordEncoder;
	private final AppUserRepository AppUserRepository;

	@Override
	public Optional<String> registerEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDTO, employee);

		Optional<Roles> role = RoleRespository.findByRoleName("ROLE_EMPLOYEE");
		if (role.isEmpty()) {
			Roles employeeRole = role.get();

			AppUser appUser = AppUser.builder().username(employeeDTO.getEmployeeID())
					.password(passwordEncoder.encode(employeeDTO.getPassword())).roles(new ArrayList()).build();
			appUser.getRoles().add(employeeRole);
			employeeRole.getAppUsers().add(appUser);
			AppUserRepository.save(appUser);

		}
		return Optional.ofNullable(employeeRespository.save(employee).getEmployeeID());
	}
	@Override
	public List<Employee> getEmployees() {
		return employeeRespository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(String id) {
		return employeeRespository.findById(id);
	}

}
