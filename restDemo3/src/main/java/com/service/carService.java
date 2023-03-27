package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.carDAO;
import com.entity.car;

@Component
public class carService 
{
	@Autowired
	private carDAO carDAO ;
	
	

	public List<car> getcar() {
		// TODO Auto-generated method stub
		return this.carDAO.findAll();
	}

}
