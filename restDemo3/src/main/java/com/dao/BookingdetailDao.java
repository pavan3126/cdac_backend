package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Bookingdetail;

public interface BookingdetailDao extends JpaRepository<Bookingdetail, Integer>{

	List<Bookingdetail>getById(int id);
}
