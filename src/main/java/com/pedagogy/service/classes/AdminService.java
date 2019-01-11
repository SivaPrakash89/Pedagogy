package com.pedagogy.service.classes;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedagogy.bean.Admin;
import com.pedagogy.bean.Provider;
import com.pedagogy.bean.Seeker;
import com.pedagogy.repo.interfaces.AdminRepoI;
import com.pedagogy.repo.interfaces.ProviderRepoI;
import com.pedagogy.repo.interfaces.SeekerRepoI;
import com.pedagogy.service.interfaces.AdminServiceI;

@Service
public class AdminService implements AdminServiceI{
	
	@Autowired
	private AdminRepoI adminRepo;

	@Autowired
	private SeekerRepoI seekerRepo;
	
	@Autowired
	private ProviderRepoI providerRepo;
	
	@Override
	public Optional<Admin> getAdmin(String email) {
		return adminRepo.findById(email);
	}

	@Transactional
	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public List<Seeker> getSeekers(String status) {
		return seekerRepo.findByStatus(status);
	}

	@Override
	public List<Provider> getProviders(String status) {
		return providerRepo.findByStatus(status);
	}

	
}
