package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.car;
import com.service.carService;

@RestController
@CrossOrigin("*")
public class carController 
{
@Autowired	
private carService carService;

@GetMapping("/cars")
public List<car> getcar()
{
	return this.carService.getcar();
	
}
}
