package com.pedagogy.repo.interfaces;


import javax.transaction.Transactional;

import com.pedagogy.bean.Admin;

@Transactional
public interface AdminRepoI extends UsersRepoI<Admin> {
}
