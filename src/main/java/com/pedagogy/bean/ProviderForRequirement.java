package com.pedagogy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProviderForRequirement {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int pRId;
	private int requirementId;
	private String providerEmail;
	private boolean acceptedBySeeker;
	public int getpRId() {
		return pRId;
	}
	public void setpRId(int pRId) {
		this.pRId = pRId;
	}
	public int getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	public String getProviderEmail() {
		return providerEmail;
	}
	public void setProviderEmail(String providerEmail) {
		this.providerEmail = providerEmail;
	}
	public boolean isAcceptedBySeeker() {
		return acceptedBySeeker;
	}
	public void setAcceptedBySeeker(boolean acceptedBySeeker) {
		this.acceptedBySeeker = acceptedBySeeker;
	}
	public ProviderForRequirement(int pRId, int requirementId, String providerEmail, boolean acceptedBySeeker) {
		super();
		this.pRId = pRId;
		this.requirementId = requirementId;
		this.providerEmail = providerEmail;
		this.acceptedBySeeker = acceptedBySeeker;
	}
	public ProviderForRequirement() {
		super();
	}
}
