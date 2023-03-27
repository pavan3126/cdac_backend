package com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Aboutus;
import com.service.aboutusService;

@RestController
@CrossOrigin("*")
public class aboutusController {

	@Autowired
	private aboutusService aboutusService;
	
	
	@PostMapping("/postabout")
	public void postabout(@RequestBody Aboutus ab)
	{
		this.aboutusService.postabouts(ab);
	}
}
