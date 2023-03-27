package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.BookingdetailDao;
import com.entity.Bookingdetail;
@Service
@Component
public class BookingdetailService {
	

	@Autowired
	private BookingdetailDao bookingdetailDao;

	public List<Bookingdetail> getBookingdetails() {
		// TODO Auto-generated method stub
		return this.bookingdetailDao.findAll();
	}

	public Bookingdetail updateBybookingid(Bookingdetail bookingdetail) {
		// TODO Auto-generated method stub
		return bookingdetailDao.save(bookingdetail);
		
	}

	public Bookingdetail addBookingdetail(Bookingdetail bookingdetail) {
		// TODO Auto-generated method stub
		return bookingdetailDao.save(bookingdetail);
		
	}

	public void deleteBybookingid(int id) {
		// TODO Auto-generated method stub
		bookingdetailDao.deleteById(id);
	}

	public List<Bookingdetail> getBookingdetailById(int id) {
		// TODO Auto-generated method stub
		return this.bookingdetailDao.getById(id);
	}
}
