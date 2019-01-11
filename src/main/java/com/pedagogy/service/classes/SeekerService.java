package com.pedagogy.service.classes;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedagogy.bean.Seeker;
import com.pedagogy.repo.interfaces.SeekerRepoI;
import com.pedagogy.service.interfaces.SeekerServiceI;

@Service
public class SeekerService implements SeekerServiceI {
	
	@Autowired
	private SeekerRepoI seekerRepo;

	@Override
	public Optional<Seeker> getSeeker(String email) {
		return seekerRepo.findById(email);
	}

	@Transactional
	@Override
	public Seeker updateSeeker(Seeker seeker) {
		return seekerRepo.save(seeker);
	}

	@Override
	public Seeker addSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return seekerRepo.save(seeker);
	}

}
