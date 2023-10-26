package com.te.hrms.service.impl;

import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.hrms.entity.AppUser;
import com.te.hrms.entity.Roles;
import com.te.hrms.repository.AppUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	private final AppUserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AppUser> appOptional = appUserRepository.findByUsername(username);
		AppUser appUser = appOptional.orElseThrow(() -> new UsernameNotFoundException(username + "not found"));
		Function<Roles, SimpleGrantedAuthority> function = r -> new SimpleGrantedAuthority(r.getRoleName());

		Set<SimpleGrantedAuthority> authorities = appUser.getRoles().stream().map(function).collect(Collectors.toSet());
		return new User(appUser.getUsername(), appUser.getPassword(), authorities);
	}

}
