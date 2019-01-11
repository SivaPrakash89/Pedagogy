package com.pedagogy;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedagogy.bean.Admin;
import com.pedagogy.bean.Login;
import com.pedagogy.bean.Provider;
import com.pedagogy.bean.Seeker;
import com.pedagogy.bean.Users;
import com.pedagogy.service.interfaces.AdminServiceI;
import com.pedagogy.service.interfaces.ProviderServiceI;
import com.pedagogy.service.interfaces.SeekerServiceI;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*", maxAge = 3600)
public class UsersController {
	
	@Autowired
	private SeekerServiceI seekerService;
	
	@Autowired
	private ProviderServiceI providerService;
	
	
	@PostMapping("/updateSeeker")
	public Seeker updateSeeker(@RequestBody Seeker seeker) {
		return seekerService.updateSeeker(seeker);
	}
	
	
	@PostMapping("/updateProvider")
	public Provider updateProvider(@RequestBody Provider provider) {
		return providerService.updateProvider(provider);
	}
	
}
