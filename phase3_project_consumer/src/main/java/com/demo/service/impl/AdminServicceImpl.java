package com.demo.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Admin;
import com.demo.service.AdminService;

@Service
public class AdminServicceImpl implements AdminService {
	
	private String url="http://localhost:9100/admin/";
	private String urlAdmins="http://localhost:9100/admins/";

	private RestTemplate restTemplate=new RestTemplate();
	@Override
	public Admin addadmin(Admin admin) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject(url, admin, Admin.class);
	}

	@Override
	public Admin updateadmin(Admin admin) {
		// TODO Auto-generated method stub
		restTemplate.put(url, admin);
		return admin;
	}

	@Override
	public List<Admin> getAlladmins() {
		ResponseEntity<List<Admin>> response=restTemplate.exchange(urlAdmins, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Admin>>() {
		});
		return response.getBody();
	}

}
