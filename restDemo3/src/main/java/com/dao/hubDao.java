package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Hub;

public interface hubDao extends JpaRepository<Hub,Integer> {

	List<Hub> findByhubid(int id);
}

