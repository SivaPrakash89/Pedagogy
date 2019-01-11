package com.pedagogy.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class SeekerRequirement {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int requirementId;
	private String email;
	private String moduleDescription;
	private int noOfDays;
	private String startDay;
	private long minBudget;
	private long maxBudget;
	private String location;
	private String trainingLevel;
	private String takeaways;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="requirementId")
	List<ProviderForRequirement> providers;
	
	public int getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getStartDay() {
		return startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	public long getMinBudget() {
		return minBudget;
	}
	public void setMinBudget(long minBudget) {
		this.minBudget = minBudget;
	}
	public long getMaxBudget() {
		return maxBudget;
	}
	public void setMaxBudget(long maxBudget) {
		this.maxBudget = maxBudget;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTrainingLevel() {
		return trainingLevel;
	}
	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}
	public String getTakeaways() {
		return takeaways;
	}
	public void setTakeaways(String takeaways) {
		this.takeaways = takeaways;
	}
	public SeekerRequirement(int requirementId, String email, String moduleDescription, int noOfDays,
			String startDay, long minBudget, long maxBudget, String location, String trainingLevel, String takeaways) {
		super();
		this.requirementId = requirementId;
		this.email=email;
		this.moduleDescription = moduleDescription;
		this.noOfDays = noOfDays;
		this.startDay = startDay;
		this.minBudget = minBudget;
		this.maxBudget = maxBudget;
		this.location = location;
		this.trainingLevel = trainingLevel;
		this.takeaways = takeaways;
	}
	public SeekerRequirement() {
		super();
	}
	
}

