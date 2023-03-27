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

import com.entity.Customer;
import com.service.customerService;

@RestController
@CrossOrigin("*")
public class customerController 
{
	@Autowired
	private customerService customerService;
	
	@GetMapping("/customer")
	public List<Customer> getCust()
	{
		return this.customerService.getcust();
	}
	
	@PutMapping("/customer/{id}")
	public void addCust(@RequestBody Customer cu)
	{
		this.customerService.savecust(cu);
	}
	
	@PostMapping("/customer")
	public Customer postCust(@RequestBody Customer cuu)
	{
		return this.customerService.postcust(cuu);
	}
	
	@DeleteMapping("/customer/{id}")
	public void deleteCust(@PathVariable int id)
	{
		this.customerService.deletecust(id);
	}
	
	@GetMapping("/customer/{id}")
	public List<Customer> getCustbyId(@PathVariable int id)
	{
		return this.customerService.getcustbyid(id);
	}

}
