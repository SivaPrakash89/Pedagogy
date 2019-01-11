package com.pedagogy.service.interfaces;

import java.util.List;

import com.pedagogy.bean.SeekerRequirement;

public interface SeekerRequirementServiceI {

	public SeekerRequirement updateRequirement(SeekerRequirement seekerRequirement);
	public List<SeekerRequirement> getRequirements(String moduleDescription);
	
}
