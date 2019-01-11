package com.pedagogy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProviderSkills {
	private String email;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int skillId;
	private String skillName;
	private int rating;
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public ProviderSkills(String email,int skillId, String skillName, int rating) {
		super();
		this.email=email;
		this.skillId = skillId;
		this.skillName = skillName;
		this.rating = rating;
	}
	public ProviderSkills() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

