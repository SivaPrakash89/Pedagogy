package com.pedagogy.repo.interfaces;

import java.util.List;

import javax.transaction.Transactional;

import com.pedagogy.bean.Provider;

@Transactional
public interface ProviderRepoI extends UsersRepoI<Provider>{

	public List<Provider> findByStatus(String status);
}
