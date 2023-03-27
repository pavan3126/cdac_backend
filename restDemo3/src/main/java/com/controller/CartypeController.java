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

import com.entity.Cartype;

import com.service.CartypeService;

@RestController
@CrossOrigin("*")
public class CartypeController 
{
	@Autowired
	private CartypeService CartypeService;
	
	@GetMapping("/cartype")
	public List<Cartype> getbooCartypes()
	{
		return this.CartypeService.getCartypes();
	}
	
	@PutMapping("/cartype/{id}")
	public Cartype updateCartype(@RequestBody Cartype cartype)
	{
		return this.CartypeService.updateByid(cartype);
	}
	
	@PostMapping("/cartype")
	public Cartype addCartype(@RequestBody Cartype cartype)
	{
		return this.CartypeService.addCartype(cartype);
	}
	
	@DeleteMapping("/cartype/{id}")
	public void deleteCartype(@PathVariable int id)
	{
		this.CartypeService.deleteByid(id);
	}
	
	@GetMapping("/cartype/{id}")
	public List<Cartype>  getCartypebyId(@PathVariable int id)
	{
		return this.CartypeService.getCartypeById(id);
	}

}
