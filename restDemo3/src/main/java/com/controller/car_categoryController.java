package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.car_category;
import com.service.car_cateService;

@RestController
@CrossOrigin("*")
public class car_categoryController {

	@Autowired
	private car_cateService car_cateService;
	
	@GetMapping("/carss")
	public List<car_category> getCars()
	{
		return this.car_cateService.getcars();
		
	}
	
}
