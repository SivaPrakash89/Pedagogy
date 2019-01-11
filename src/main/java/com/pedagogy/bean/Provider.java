package com.pedagogy.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Provider extends Users{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String companyName;
	private String dateOfBirth;
	private String pancardNo;
	private String gstNo;
	private String clientele;
	private boolean subscribed;
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="email")
	private List<ProviderSkills> skillList;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public List<ProviderSkills> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<ProviderSkills> skillList) {
		this.skillList = skillList;
	}
	public Provider(
			String companyName, String dateOfBirth, String pancardNo, String gstNo, String clientele, boolean subscribed, List<ProviderSkills> skillList) {
		super();
		this.companyName = companyName;
		this.dateOfBirth = dateOfBirth;
		this.pancardNo = pancardNo;
		this.gstNo = gstNo;
		this.clientele = clientele;
		this.skillList = skillList;
		this.setSubscribed(subscribed);
	}
	public Provider() {
		super();
	}
	public String getClientele() {
		return clientele;
	}
	public void setClientele(String clientele) {
		this.clientele = clientele;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	
}

