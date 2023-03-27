package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.BookingHeaderDao;
import com.entity.Bookingheader;

@Service
@Component
public class BookingHeaderService {
	

	@Autowired
	private BookingHeaderDao bookingHeaderDao;

	public List<Bookingheader> getBookingHeaders() {
		// TODO Auto-generated method stub
		return this.bookingHeaderDao.findAll();
	}

	public Bookingheader updateBybookingid(Bookingheader bookingHeader) {
		// TODO Auto-generated method stub
		return bookingHeaderDao.save(bookingHeader);
		
	}

	public Bookingheader addBookingHeader(Bookingheader bookingHeader) {
		// TODO Auto-generated method stub
		return bookingHeaderDao.save(bookingHeader);
		
	}

	public void deleteBybookingid(int id) {
		// TODO Auto-generated method stub
		bookingHeaderDao.deleteById(id);
	}

	public  List<Bookingheader>  getBookingHeaderById(int id) {
		// TODO Auto-generated method stub
		return this.bookingHeaderDao.findById(id);
	}
}
