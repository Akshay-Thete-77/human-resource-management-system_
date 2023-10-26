package com.te.hrms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
public class AppUser {
	private String username;
	private String password;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Roles> roles= new ArrayList();
}
