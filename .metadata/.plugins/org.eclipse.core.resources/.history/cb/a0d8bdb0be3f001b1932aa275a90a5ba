package com.demo.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private String url="http://localhost:9000/product/";
	private String urlProducts="http://localhost:9000/products/";
	
	//use RestTemplate API for making the calls to any RESTful services and consume them in the current application.
	private RestTemplate restTemplate=new RestTemplate();

	@Override
	public Product addProduct(Product product) {
		
		return restTemplate.postForObject(url, product, Product.class);
	}

	@Override
	public Product updateProduct(Product product) {
		
		restTemplate.put(url, product);
		return product;
	}

	@Override
	public Product getProductById(int id) {
		ResponseEntity<Product> response=restTemplate.exchange(url+id, HttpMethod.GET,null,Product.class);
		return response.getBody();
	}

	@Override
	public void deleteProductById(int id) {
		restTemplate.delete(url+id);
		
	}

	@Override
	public List<Product> getAllProducts() {
		ResponseEntity<List<Product>> response=restTemplate.exchange(urlProducts, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Product>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Product> getProductsByManufacturerName(String manufacturerName) {
		
		ResponseEntity<List<Product>> response=restTemplate.exchange(urlProducts+manufacturerName, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Product>>() {
		});
		return response.getBody();
	}

	

}
