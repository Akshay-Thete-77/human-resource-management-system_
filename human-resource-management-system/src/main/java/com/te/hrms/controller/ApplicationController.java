package com.te.hrms.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.hrms.dto.EmployeeDTO;
import com.te.hrms.dto.LoginDTO;
import com.te.hrms.entity.Employee;
import com.te.hrms.response.SuccessResponse;
import com.te.hrms.service.EmployeeService;
import com.te.hrms.utils.JwtUtils;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class ApplicationController {

	private final EmployeeService employeeService;
	private final AuthenticationManager authenticationManager;
	private final JwtUtils jwtUtils;

	@PostMapping("/register/employee")
	public ResponseEntity<SuccessResponse> registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String employeeID = employeeService.registerEmployee(employeeDTO)
				.orElseThrow(() -> new RuntimeException("employee registration faied...!!"));
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(employeeID)
				.message("employee registration successfull...!!").timestamp(LocalDateTime.now()).build());
	}

	@PostMapping("/login")
	public ResponseEntity<SuccessResponse> login(@RequestBody LoginDTO loginDTO) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword()));
		String token = jwtUtils.generateToken(loginDTO.getUsername());
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(token)
				.message("login successful.....!!!!").timestamp(LocalDateTime.now()).build());
	}

}
