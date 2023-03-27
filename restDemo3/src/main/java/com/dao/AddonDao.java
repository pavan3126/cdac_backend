package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Addon;


@Repository
public interface AddonDao extends JpaRepository<Addon,Integer>
{
	List <Addon> findByaddonid(int id);
}
