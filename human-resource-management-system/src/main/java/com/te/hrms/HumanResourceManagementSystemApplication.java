package com.te.hrms;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.te.hrms.entity.AppUser;
import com.te.hrms.entity.Roles;
import com.te.hrms.repository.AppUserRepository;
import com.te.hrms.repository.RoleRespository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class HumanResourceManagementSystemApplication {

	private final RoleRespository roleRespository;
	private final AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(HumanResourceManagementSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Roles employee = Roles.builder().roleName("ROLE_EMPLOYEE").appUsers(new ArrayList()).build();
			Roles hrRole = Roles.builder().roleName("ROLE_HR").appUsers(new ArrayList()).build();

			AppUser appUserHR = AppUser.builder().username("hr01").password("hr123").roles(new ArrayList()).build();
			appUserHR.getRoles().add(hrRole);
			hrRole.getAppUsers().add(appUserHR);

			roleRespository.save(employee);
			roleRespository.save(hrRole);
			appUserRepository.save(appUserHR);

		};
	}

}
