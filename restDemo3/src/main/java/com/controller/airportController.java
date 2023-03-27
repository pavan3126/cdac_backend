package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.airport;
import com.service.airportService;

@RestController
@CrossOrigin("*")
public class airportController
{

@Autowired
private airportService airportService;


@GetMapping("/airport")
public List<airport> getairports()
{
	return this.airportService.getairports();
	
}
}
