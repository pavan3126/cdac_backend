package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.Hub;

public interface getAirportDao extends JpaRepository<Hub,Integer> {
	
	@Query("SELECT t FROM Hub t WHERE t.cityid = :cityid and t.isAirport= 'true' ")
	List<Hub> getairport(@Param("cityid") int id);

}
