package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public Product addProduct(Product product) {
		
		return repository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public List<Product> getProductsByManufacturerName(String manufacturerName) {
		
		return repository.findByManufacturerName(manufacturerName);
	}

}
