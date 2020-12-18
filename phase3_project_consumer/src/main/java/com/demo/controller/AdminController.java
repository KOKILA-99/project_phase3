package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Admin;
import com.demo.model.Shoes;
import com.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/admin")
	public Admin addadmin(@RequestBody Admin admin) {
		// TODO Auto-generated method stub
		return service.addadmin(admin);
	}

	@PutMapping("/admin")
	public Admin updateadmin(@RequestBody Admin admin) {
		// TODO Auto-generated method stub
		return service.updateadmin(admin);
	}
	
	@GetMapping("/admins")
	public List<Admin> getAlladmins() {
		// TODO Auto-generated method stub
		return service.getAlladmins();
	}

}
