package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Hub;
import com.service.hubService;

@RestController
@CrossOrigin("*")
public class hubController {
	@Autowired
	private hubService hubService;
	//@GetMapping ("/hub")
//	public List<Hub> gethub(){
//		
//		return this.hubService.gethub();
//		
//	}
	@GetMapping ("/hub/{id}")
	public List<Hub> gethubbyid(@PathVariable int id)
	{
		return this.hubService.gethubbyid(id);
	}
	
}
