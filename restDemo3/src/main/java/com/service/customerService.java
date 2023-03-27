package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.customerDao;
import com.entity.Customer;

@Service
@Component
public class customerService {
	@Autowired
	private customerDao customerDao;

	public List<Customer> getcust() {
		// TODO Auto-generated method stub
		return this.customerDao.findAll();
	}

	public void savecust(Customer cu) {
		// TODO Auto-generated method stub
		this.customerDao.save(cu);
	}

	public void deletecust(int id) {
		// TODO Auto-generated method stub

		this.customerDao.deleteById(id);
	}

	public Customer postcust(Customer cuu) {
		// TODO Auto-generated method stub
		Customer cuu1 = this.customerDao.save(cuu);

		return cuu1;
	}

	public List<Customer> getcustbyid(int id) {
		// TODO Auto-generated method stub
		return this.customerDao.findBycustomerid(id);
	}

}
