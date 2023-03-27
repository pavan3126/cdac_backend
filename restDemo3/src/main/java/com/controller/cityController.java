package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.entity.City;
import com.service.cityService;

@RestController
@CrossOrigin("*")
public class cityController {
	@Autowired
	private cityService cityService;
	@GetMapping ("/city")
	public List<City> getcity()
	{
		return this.cityService.getcity();
	}
	
	@GetMapping ("/city/{id}")
	public List<City> getcitybyid(@PathVariable int id)
	{
		return this.cityService.getcitybyid(id);
	}
}
