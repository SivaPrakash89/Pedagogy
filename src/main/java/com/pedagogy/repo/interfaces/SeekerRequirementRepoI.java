package com.pedagogy.repo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedagogy.bean.SeekerRequirement;

public interface SeekerRequirementRepoI extends JpaRepository<SeekerRequirement, String>{
	
	public List<SeekerRequirement> findByModuleDescription(String moduleDescription);

}
