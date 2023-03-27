package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customer;

public interface customerDao extends JpaRepository<Customer, Integer>
{

	List<Customer> findBycustomerid(int id);

}
