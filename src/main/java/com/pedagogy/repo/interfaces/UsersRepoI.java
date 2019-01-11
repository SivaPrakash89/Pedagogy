package com.pedagogy.repo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.pedagogy.bean.Users;

@NoRepositoryBean
public interface UsersRepoI<T extends Users> extends JpaRepository<T, String>{

}
