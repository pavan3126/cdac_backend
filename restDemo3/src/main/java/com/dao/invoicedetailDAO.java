package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.invoicedetail;

public interface invoicedetailDAO extends JpaRepository<invoicedetail, Integer> {

}
