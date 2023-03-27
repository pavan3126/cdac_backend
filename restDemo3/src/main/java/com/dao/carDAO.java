package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.car;

public interface carDAO extends JpaRepository<car, Integer>
{

}
