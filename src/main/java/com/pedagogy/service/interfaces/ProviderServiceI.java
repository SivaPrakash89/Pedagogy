package com.pedagogy.service.interfaces;

import java.util.Optional;

import com.pedagogy.bean.Provider;

public interface ProviderServiceI {

	public Optional<Provider> getProvider(String email);

	public Provider updateProvider(Provider provider);

	public Provider addProvider(Provider provider);
	

}
