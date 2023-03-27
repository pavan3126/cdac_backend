package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.statedao;
import com.entity.State;
@Service
@Component
public class stateService 
{
	@Autowired
	private statedao statedao;

	public List<State> getstate() {
		// TODO Auto-generated method stub
		return this.statedao.findAll();
	}
	


}
