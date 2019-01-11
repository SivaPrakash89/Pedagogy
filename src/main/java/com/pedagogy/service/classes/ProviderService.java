package com.pedagogy.service.classes;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedagogy.bean.Provider;
import com.pedagogy.repo.interfaces.ProviderRepoI;
import com.pedagogy.service.interfaces.ProviderServiceI;

@Service
public class ProviderService implements ProviderServiceI {

	@Autowired
	private ProviderRepoI providerRepo;

	@Override
	public Optional<Provider> getProvider(String email) {
		return providerRepo.findById(email);
	}

	@Transactional
	@Override
	public Provider updateProvider(Provider provider) {
		return providerRepo.save(provider);
	}

	@Override
	public Provider addProvider(Provider provider) {
		return providerRepo.save(provider);
	}
	


}
