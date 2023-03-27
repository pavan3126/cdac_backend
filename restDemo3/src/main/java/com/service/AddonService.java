package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.AddonDao;
import com.entity.Addon;

@Service
@Component
public class AddonService {
	

	@Autowired
	public AddonDao addonDao;

	public List<Addon> getAddons() {
		// TODO Auto-generated method stub
		return this.addonDao.findAll();
	}

	public Addon updateByid(Addon addon) {
		// TODO Auto-generated method stub
		return addonDao.save(addon);
		
	}

	public Addon addAddon(Addon addon) {
		// TODO Auto-generated method stub
		return addonDao.save(addon);
		
	}

	public void deleteByid(int id) {
		// TODO Auto-generated method stub
		addonDao.deleteById(id);
	}

	public List<Addon> getaddonbyid(int id) {
		// TODO Auto-generated method stub
		return this.addonDao.findByaddonid(id);
	}
}
