package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.car_categoryDao;
import com.entity.car_category;

@Component
public class car_cateService {
	@Autowired
	private car_categoryDao car_categoryDao;

	public List<car_category> getcars() {
		// TODO Auto-generated method stub
		return this.car_categoryDao.findAll();
	}

}
