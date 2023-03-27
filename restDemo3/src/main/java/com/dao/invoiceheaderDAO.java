package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.entity.Invoiceheader;

public interface invoiceheaderDAO extends JpaRepository<Invoiceheader, Integer> {

	List<Invoiceheader> findByinvoiceid(int id);
}
