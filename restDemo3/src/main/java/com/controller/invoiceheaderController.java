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

import com.entity.Invoiceheader;
import com.service.invoiceheaderService;

@RestController
@CrossOrigin("*")
public class invoiceheaderController {
	@Autowired
	private invoiceheaderService invoiceheaderService1;
	
	@GetMapping("/invoiceheader")
	public List<Invoiceheader> getinvoiceheader(){
		return this.invoiceheaderService1.getinvoiceheader();
	}

	
	
	@PutMapping("/invoiceheader/{id}")
	public Invoiceheader updateinvoiceheader(@RequestBody Invoiceheader cu, @PathVariable int id)
	{
		return this.invoiceheaderService1.updateByinvoiceid(cu);
	}
	
	
	
	
	@PostMapping("/invoiceheader")
	public Invoiceheader postCust(@RequestBody Invoiceheader cuu)
	{
		return this.invoiceheaderService1.postcust(cuu);
	}
	
	@DeleteMapping("/invoiceheader/{id}")
	public void deleteCust(@PathVariable int id)
	{
		this.invoiceheaderService1.deletecust(id);
	}
	
	@GetMapping("/invoiceheader/{id}")
	public List<Invoiceheader> getCustbyId(@PathVariable int id)
	{
		return this.invoiceheaderService1.getcustbyid(id);
	}
	
	
}
