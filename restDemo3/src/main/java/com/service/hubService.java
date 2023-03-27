package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.hubDao;

import com.entity.Hub;
@Service
@Component
public class hubService {
	@Autowired
private hubDao hubDao;
//	public List<Hub> gethub() {
//		// TODO Auto-generated method stub
//		return this.hubDao.findAll();
//	}

	public List<Hub> gethubbyid(int id) {
		// TODO Auto-generated method stub
		return this.hubDao.findByhubid(id);
	}
	
}
