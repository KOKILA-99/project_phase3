package com.demo.service;

import java.util.List;

import com.demo.model.Admin;

public interface AdminService {

	public Admin addadmin(Admin admin);
	public Admin updateadmin(Admin admin);
	public List<Admin> getAlladmins();
}
