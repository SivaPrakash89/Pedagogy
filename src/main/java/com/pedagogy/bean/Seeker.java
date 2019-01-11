package com.pedagogy.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Seeker extends Users{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String companyName;
	private boolean subscribed;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="email")
	private List<SeekerRequirement> requirementList;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<SeekerRequirement> getRequirementList() {
		return requirementList;
	}
	public void setRequirementList(List<SeekerRequirement> requirementList) {
		this.requirementList = requirementList;
	}
	public Seeker(String companyName,boolean subscribed,
			List<SeekerRequirement> requirementList) {
		super();
		this.companyName = companyName;
		this.setSubscribed(subscribed);
		this.requirementList = requirementList;
	}
	public Seeker() {
		super();
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
}

