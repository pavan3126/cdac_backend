package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.CartypeDao;
import com.entity.Cartype;
@Service
@Component
public class CartypeService {
	

	@Autowired
	private CartypeDao cartypeDao;

	public List<Cartype> getCartypes() {
		// TODO Auto-generated method stub
		return this.cartypeDao.findAll();
	}

	public Cartype updateByid(Cartype cartype) {
		// TODO Auto-generated method stub
		return cartypeDao.save(cartype);
		
	}

	public Cartype addCartype(Cartype cartype) {
		// TODO Auto-generated method stub
		return cartypeDao.save(cartype);
		
	}

	public void deleteByid(int id) {
		// TODO Auto-generated method stub
		cartypeDao.deleteById(id);
	}

	public List<Cartype>  getCartypeById(int id) {
		// TODO Auto-generated method stub
		return this.cartypeDao.findBycartypeid(id);
	}
}
