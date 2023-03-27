package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.airport;

public interface airportDAO extends JpaRepository<airport, Integer> {

}
