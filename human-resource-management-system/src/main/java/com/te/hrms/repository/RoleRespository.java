package com.te.hrms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.Roles;

public interface RoleRespository extends JpaRepository<Roles, Integer> {

	Optional<Roles> findByRoleName(String string);

}
