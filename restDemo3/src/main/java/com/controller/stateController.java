package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.State;
import com.service.stateService;

@RestController
@CrossOrigin("*")
public class stateController 
{
	@Autowired
	private stateService service;
	
	@GetMapping("/state")
	public List<State> getstate()
	{
		return this.service.getstate();
	}

}
