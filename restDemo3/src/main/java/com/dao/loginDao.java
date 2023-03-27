package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Login;

public interface loginDao extends JpaRepository<Login, String>  {

	List<Login> findByname(String name);
	List<Login> deleteByname(String name);
	


}
