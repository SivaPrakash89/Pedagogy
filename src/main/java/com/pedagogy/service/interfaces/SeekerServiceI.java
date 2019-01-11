package com.pedagogy.service.interfaces;

import java.util.Optional;

import com.pedagogy.bean.Seeker;

public interface SeekerServiceI {
	
public Optional<Seeker> getSeeker(String email);

public Seeker updateSeeker(Seeker seeker);

public Seeker addSeeker(Seeker seeker);

}
