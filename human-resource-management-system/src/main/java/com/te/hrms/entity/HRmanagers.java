package com.te.hrms.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class HRmanagers {
	@Id
	private String username;
	private String passwrord;
	
}
