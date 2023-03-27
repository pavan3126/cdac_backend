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

import com.entity.Bookingdetail;
import com.service.BookingdetailService;

@RestController
@CrossOrigin("*")
public class BookingdetailController 
{
	@Autowired
	private BookingdetailService bookingdetailService;
	
	@GetMapping("/bookingdetail")
	public List<Bookingdetail> getbooBookingdetails()
	{
		return this.bookingdetailService.getBookingdetails();
	}
	
	@PutMapping("/bookingdetail/{id}")
	public Bookingdetail updateBookingdetail(@RequestBody Bookingdetail bookingdetail)
	{
		return this.bookingdetailService.updateBybookingid(bookingdetail);
	}
	
	@PostMapping("/bookingdetail")
	public Bookingdetail addBookingdetail(@RequestBody Bookingdetail bookingdetail)
	{
		return this.bookingdetailService.addBookingdetail(bookingdetail);
	}
	
	@DeleteMapping("/bookingdetail/{id}")
	public void deleteBookingdetail(@PathVariable int id)
	{
		this.bookingdetailService.deleteBybookingid(id);
	}
	
	@GetMapping("/bookingdetail/{id}")
	public List<Bookingdetail> getBookingdetailById(@PathVariable int id)
	{
		return this.bookingdetailService.getBookingdetailById(id);
	}

}
