package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.entity.Login;
import com.service.loginService;

@RestController
@CrossOrigin("*")
public class loginController {
	@Autowired
	private loginService loginService;
	@GetMapping ("/login")
	public List<Login> getlogin()
	{
		return this.loginService.getlogin();
	}
	
	@GetMapping ("/login/{name}")
	public List<Login> getloginbyid(@PathVariable String name)
	{
		return this.loginService.getloginbyid(name);
	}
	
	@PutMapping("/login/{name}")
	public void addCust(@RequestBody Login cu)
	{
		this.loginService.addCust(cu);
	}
	
	@PostMapping("/login")
	public Login postCust(@RequestBody Login cuu)
	{
		return this.loginService.postCust(cuu);
	}
	
	@DeleteMapping("/login/{name}")
	public void deleteCust(@PathVariable String name)
	{
		this.loginService.deleteCust(name);
	}
	
	
	
	
	
}
