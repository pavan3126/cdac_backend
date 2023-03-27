package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.invoicedetailDAO;
import com.entity.invoicedetail;

@Component
public class invoicedetailService

{
@Autowired
private invoicedetailDAO invoicedetailDAO;

public List<invoicedetail> getinvoicedetail() {
	// TODO Auto-generated method stub
	return this.invoicedetailDAO.findAll();
}

}
