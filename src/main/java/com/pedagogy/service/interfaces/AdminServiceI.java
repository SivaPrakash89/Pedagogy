package com.pedagogy.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.pedagogy.bean.Admin;
import com.pedagogy.bean.Provider;
import com.pedagogy.bean.Seeker;

public interface AdminServiceI {
	public Optional<Admin> getAdmin(String email);

	public Admin updateAdmin(Admin admin);

	public Admin addAdmin(Admin admin);
	
	public List<Seeker> getSeekers(String status);
	public List<Provider> getProviders(String status);
}
