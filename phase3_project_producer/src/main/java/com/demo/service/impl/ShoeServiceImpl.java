package com.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Shoes;
import com.demo.repository.ShoeRepository;
import com.demo.service.ShoeService;

@Service
public class ShoeServiceImpl implements ShoeService {

	@Autowired
	private ShoeRepository repository;
	@Override
	public Shoes addShoe(Shoes shoes) {
		
		return repository.save(shoes);
	}

	@Override
	public Shoes updateShoe(Shoes shoes) {
		return repository.save(shoes);
	}

	@Override
	public Shoes getShoeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteShoeById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Shoes> getAllShoes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Shoes> getShoesByCategory(String category) {
		
		return  repository.findByCategory(category);
	}

}
