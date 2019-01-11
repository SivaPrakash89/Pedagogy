package com.pedagogy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
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
@CrossOrigin(origins="*", maxAge = 3600)
public class BasicController {
	
	@Autowired
	private SeekerServiceI seekerService;
	
	@Autowired
	private ProviderServiceI providerService;
	
	@Autowired
	private AdminServiceI adminService;
	
	
	@PostMapping("/signup")
	public Users addUsers(@RequestBody Users users) {
		if(users.getRole().equalsIgnoreCase("seeker")) {
			Seeker seeker = new Seeker();
			seeker.setEmail(users.getEmail());
			seeker.setPassword(users.getPassword());
			seeker.setFirstName(users.getFirstName());
			seeker.setLastName(users.getLastName());
			seeker.setPhoneNo(users.getPhoneNo());
			seeker.setRole(users.getRole());
			seeker.setStatus("New");
			return seekerService.addSeeker(seeker);
		}
		else if(users.getRole().equalsIgnoreCase("provider")) {
			Provider provider = new Provider();
			provider.setEmail(users.getEmail());
			provider.setPassword(users.getPassword());
			provider.setFirstName(users.getFirstName());
			provider.setLastName(users.getLastName());
			provider.setPhoneNo(users.getPhoneNo());
			provider.setRole(users.getRole());
			provider.setStatus("New");
			return providerService.addProvider(provider);
		}
		else if(users.getRole().equalsIgnoreCase("admin")) {
			Admin admin = new Admin();
			admin.setEmail(users.getEmail());
			admin.setPassword(users.getPassword());
			admin.setFirstName(users.getFirstName());
			admin.setLastName(users.getLastName());
			admin.setPhoneNo(users.getPhoneNo());
			admin.setRole(users.getRole());
			return adminService.addAdmin(admin);
		}
		return null;
		
	}
	
	@PostMapping("/signin")
	public Users  validateLogin(@RequestBody Login login) {
		Optional<Seeker> seeker= seekerService.getSeeker(login.getEmail());
		Optional<Provider> provider = providerService.getProvider(login.getEmail());
		Optional<Admin> admin = adminService.getAdmin(login.getEmail());
		Users finalUser = null;
		if(!seeker.isEmpty()) {
			Users users = seeker.get();
			if(users.getPassword().equals(login.getPassword())) {
				finalUser = users;
			}
		}
		
		else if(seeker.isEmpty()) {
			if(!provider.isEmpty()) {
				Users users = provider.get();
				if(users.getPassword().equals(login.getPassword())) {
					finalUser = users;
				}
			}
		}
		else if(provider.isEmpty()) {
			if(!admin.isEmpty()) {
				Users users = admin.get();
				if(users.getPassword().equals(login.getPassword())) {
					finalUser = users;
				}
			}
		}
		
		return finalUser;
	}
	
	@GetMapping("/validate/{email}")
	public boolean validateEmail(@PathVariable("email") String email) {
		Optional<Seeker> seeker= seekerService.getSeeker(email);
		Optional<Provider> provider = providerService.getProvider(email);
		if(seeker.isPresent() || provider.isPresent()) {
			return false;
		}
		return true;
		
	}

}
