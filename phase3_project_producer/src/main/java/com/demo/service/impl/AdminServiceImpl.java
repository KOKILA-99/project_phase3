package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Admin;
import com.demo.repository.AdminRepository;
import com.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository admin_repository;
	@Override
	public Admin addadmin(Admin admin) {
		// TODO Auto-generated method stub
		return admin_repository.save(admin);
	}

	@Override
	public Admin updateadmin(Admin admin) {
		// TODO Auto-generated method stub
		return admin_repository.save(admin);
	}

	@Override
	public List<Admin> getAlladmins() {
		// TODO Auto-generated method stub
		return admin_repository.findAll();
	}

}
