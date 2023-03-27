package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.aboutusDAO;
import com.entity.Aboutus;

@Service
@Component
public class aboutusService {

	@Autowired
	private aboutusDAO aboutusDAO;

	public void postabouts(Aboutus ab) {
		// TODO Auto-generated method stub
		this.aboutusDAO.save(ab);
	}

	
	
}
