package com.te.hrms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {

	Optional<AppUser> findByUsername(String username);

}
