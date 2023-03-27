package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.City;

public interface cityDao extends JpaRepository<City, Integer>  {

	List<City> findBystateid(int id);
	

}
