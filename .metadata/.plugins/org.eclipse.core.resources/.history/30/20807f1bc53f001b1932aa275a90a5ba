package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController  {

	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return service.addProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return service.updateProduct(product);
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getProductById(id);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteProductById(id);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return service.getAllProducts();
	}

	@GetMapping("/products/{manufacturerName}")
	public List<Product> getProductsByManufacturerName(@PathVariable String manufacturerName) {
		// TODO Auto-generated method stub
		return service.getProductsByManufacturerName(manufacturerName);
	}

}
