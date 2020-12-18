package com.demo.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Shoes;
import com.demo.service.ShoeService;

@Service
public class ShoeServiceImpl implements ShoeService {
	
	private String url="http://localhost:9100/shoe/";
	private String urlShoes="http://localhost:9100/shoes/";
	
	//use RestTemplate API for making the calls to any RESTful services and consume them in the current application.
	private RestTemplate restTemplate=new RestTemplate();

	@Override
	public Shoes addShoe(Shoes shoe) {
		
		return restTemplate.postForObject(url, shoe, Shoes.class);
	}

	@Override
	public Shoes updateShoe(Shoes shoe) {
		
		restTemplate.put(url, shoe);
		return shoe;
	}

	@Override
	public Shoes getShoeById(int id) {
		ResponseEntity<Shoes> response=restTemplate.exchange(url+id, HttpMethod.GET,null,Shoes.class);
		return response.getBody();
	}

	@Override
	public void deleteShoeById(int id) {
		restTemplate.delete(url+id);
		
	}

	@Override
	public List<Shoes> getAllShoes() {
		ResponseEntity<List<Shoes>> response=restTemplate.exchange(urlShoes, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Shoes>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Shoes> getShoesByCategory(String category) {
		
		ResponseEntity<List<Shoes>> response=restTemplate.exchange(urlShoes+category, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Shoes>>() {
		});
		return response.getBody();
	}

	

}
