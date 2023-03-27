package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Addon;
import com.service.AddonService;

@RestController
@CrossOrigin("*")
public class AddonController 
{
	@Autowired
	private AddonService addonService;
	
	@GetMapping("/addon")
	public List<Addon> getbooAddons()
	{
		return this.addonService.getAddons();
	}
	
	@PutMapping("/addon/{id}")
	public Addon updateAddon(@RequestBody Addon addon)
	{
		return this.addonService.updateByid(addon);
	}
	
	@PostMapping("/addon")
	public Addon addAddon(@RequestBody Addon addon)
	{
		return this.addonService.addAddon(addon);
	}
	
	@DeleteMapping("/addon/{id}")
	public void deleteAddon(@PathVariable int id)
	{
		this.addonService.deleteByid(id);
	}
	
	@GetMapping("/addon/{id}")
	public List<Addon> getAddonById(@PathVariable int id)
	{
		return this.addonService.getaddonbyid(id);
		
	}

}
