package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.invoicedetail;
import com.service.invoicedetailService;

@RestController
@CrossOrigin("*")
public class invoicedetailController 
{
@Autowired
private invoicedetailService invoicedetailService;

@GetMapping("/invoicedetail")
public List<invoicedetail> getinvoicedetail()
{
	return this.invoicedetailService.getinvoicedetail();
	
}
}