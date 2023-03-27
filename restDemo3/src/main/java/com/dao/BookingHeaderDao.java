package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Bookingheader;

public interface BookingHeaderDao extends JpaRepository<Bookingheader, Integer>{

	 List<Bookingheader> findById(int id);
}
