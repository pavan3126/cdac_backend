package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Cartype;


public interface CartypeDao extends JpaRepository<Cartype, Integer>{

	List<Cartype> findBycartypeid( int id);
}
