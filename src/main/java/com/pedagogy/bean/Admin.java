package com.pedagogy.bean;

import javax.persistence.Entity;

@Entity
public class Admin extends Users{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Admin(String companyName) {
		super();
		this.companyName = companyName;
	}

	public Admin() {
		super();
	}
	
}
