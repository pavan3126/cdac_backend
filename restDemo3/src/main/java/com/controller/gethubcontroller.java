package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Hub;

import com.service.gethubService;

@RestController
@CrossOrigin("*")
public class gethubcontroller {
	@Autowired
	private gethubService hubervice;
//	@GetMapping ("/hub")
//	public List<Hub> gethub(){
//		
//		return this.hubService.gethub();
//		
//	}
	@GetMapping ("/gethubbycid/{id}")
	public List<Hub> getairportbycid(@PathVariable int id)
	{
		return this.hubervice.gethubbycid(id);
	}
	
}
