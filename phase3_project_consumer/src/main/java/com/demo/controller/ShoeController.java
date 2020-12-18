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

import com.demo.model.Shoes;
import com.demo.service.ShoeService;

@RestController
public class ShoeController  {

	@Autowired
	private ShoeService service;
	
	@PostMapping("/shoe")
	public Shoes addProduct(@RequestBody Shoes shoe) {
		// TODO Auto-generated method stub
		return service.addShoe(shoe);
	}

	@PutMapping("/shoe")
	public Shoes updateProduct(@RequestBody Shoes shoe) {
		// TODO Auto-generated method stub
		return service.updateShoe(shoe);
	}

	@GetMapping("/shoe/{id}")
	public Shoes getShoeById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getShoeById(id);
	}

	@DeleteMapping("/shoe/{id}")
	public void deleteShoeById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteShoeById(id);
	}

	@GetMapping("/shoes")
	public List<Shoes> getAllShoes() {
		// TODO Auto-generated method stub
		return service.getAllShoes();
	}

	@GetMapping("/shoes/{category}")
	public List<Shoes> getProductsByCategory(@PathVariable String category) {
		// TODO Auto-generated method stub
		return service.getShoesByCategory(category);
	}

}
