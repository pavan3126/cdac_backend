package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.airportDAO;
import com.entity.airport;

@Component
public class airportService

{
@Autowired
private airportDAO airportDAO;

public List<airport> getairports() {
	// TODO Auto-generated method stub
	return this.airportDAO.findAll();
}
	
	
}
