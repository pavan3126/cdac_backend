package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dao.loginDao;
import com.entity.Login;
@Service
@Component
public class loginService {
	@Autowired
	private loginDao loginDao;

	public List<Login> getlogin() {
		// TODO Auto-generated method stub
		return this.loginDao.findAll();
	}
	
	
	public List<Login> getloginbyid(@PathVariable String name)
	{
		return this.loginDao.findByname(name);
	}
	

	public void addCust(@RequestBody Login cu)
	{
		this.loginDao.save(cu);
	}
	

	public Login postCust(@RequestBody Login cuu)
	{
		return this.loginDao.save(cuu);
	}

	public void deleteCust(@PathVariable String name)
	{
		this.loginDao.deleteById(name);
	}
	
	
}
