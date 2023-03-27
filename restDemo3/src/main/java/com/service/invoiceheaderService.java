package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.invoiceheaderDAO;
import com.entity.Bookingheader;
import com.entity.Cartype;
import com.entity.Customer;
import com.entity.Invoiceheader;
@Service
@Component
public class invoiceheaderService {
	
	
	@Autowired
	private invoiceheaderDAO invoicedao;
	
	
	
	public List<Invoiceheader> getinvoiceheader(){
	return this.invoicedao.findAll();
	}
	
	

	public Invoiceheader updateByinvoiceid(Invoiceheader cu) {
		// TODO Auto-generated method stub
		return invoicedao.save(cu);
	}
	
	
	
	public void deletecust(int id) {
		// TODO Auto-generated method stub

		this.invoicedao.deleteById(id);
	}

	public Invoiceheader postcust(Invoiceheader cuu) {
		// TODO Auto-generated method stub
		Invoiceheader cuu1 = this.invoicedao.save(cuu);

		return cuu1;
	}

	public List<Invoiceheader> getcustbyid(int id) {
		// TODO Auto-generated method stub
		return this.invoicedao.findByinvoiceid(id);
	}
}
