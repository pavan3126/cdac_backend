package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.cityDao;
import com.entity.City;
@Service
@Component
public class cityService {
	@Autowired
	private cityDao cityDao;

	
	public List<City> getcity() {
		// TODO Auto-generated method stub
		return this.cityDao.findAll();
	}

	
	public List<City> getcitybyid(int id) {
		// TODO Auto-generated method stub
		return this.cityDao.findBystateid(id);
	}
	
	

}
