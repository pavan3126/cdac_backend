package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.getAirportDao;

import com.entity.Hub;
@Service
@Component
public class getairportService {
	@Autowired
private getAirportDao airportDao;
//	public List<Hub> gethub() {
//		// TODO Auto-generated method stub
//		return this.hubDao.findAll();
//	}

	public List<Hub> getairportbycid(int id) {
		// TODO Auto-generated method stub
		return this.airportDao.getairport(id);
	}
	
}
