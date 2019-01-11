package com.pedagogy.repo.interfaces;

import java.util.List;

import javax.transaction.Transactional;

import com.pedagogy.bean.Seeker;

@Transactional
public interface SeekerRepoI extends UsersRepoI<Seeker>{

	public List<Seeker> findByStatus(String status);

	
}
