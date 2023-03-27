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

import com.entity.Bookingheader;
import com.service.BookingHeaderService;

@RestController
@CrossOrigin("*")
public class BookingHeaderController 
{
	@Autowired
	private BookingHeaderService bookingHeaderService;
	
	@GetMapping("/bookingheader")
	public List<Bookingheader> getbooBookingHeaders()
	{
		return this.bookingHeaderService.getBookingHeaders();
	}
	
	@PutMapping("/bookingheader/{id}")
	public Bookingheader updateBookingHeader(@RequestBody Bookingheader bookingHeader)
	{
		return this.bookingHeaderService.updateBybookingid(bookingHeader);
	}
	
	@PostMapping("/bookingheader")
	public Bookingheader addBookingHeader(@RequestBody Bookingheader bookingHeader)
	{
		return this.bookingHeaderService.addBookingHeader(bookingHeader);
	}
	
	@DeleteMapping("/bookingheader/{id}")
	public void deleteBookingHeader(@PathVariable int id)
	{
		this.bookingHeaderService.deleteBybookingid(id);
	}
	
	@GetMapping("/bookingheader/{id}")
	public  List<Bookingheader>  getBookingHeaderById(@PathVariable int id)
	{
		return this.bookingHeaderService.getBookingHeaderById(id);
	}

}
