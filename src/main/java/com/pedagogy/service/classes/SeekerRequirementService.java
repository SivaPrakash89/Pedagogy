package com.pedagogy.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pedagogy.bean.SeekerRequirement;
import com.pedagogy.repo.interfaces.SeekerRequirementRepoI;
import com.pedagogy.service.interfaces.SeekerRequirementServiceI;

public class SeekerRequirementService implements SeekerRequirementServiceI {
	
	@Autowired
	private SeekerRequirementRepoI seekerRequirementRepo;

	@Override
	public SeekerRequirement updateRequirement(SeekerRequirement seekerRequirement) {
		return seekerRequirementRepo.save(seekerRequirement);
	}

	@Override
	public List<SeekerRequirement> getRequirements(String moduleDescription) {
		return seekerRequirementRepo.findByModuleDescription(moduleDescription);
	}

}
