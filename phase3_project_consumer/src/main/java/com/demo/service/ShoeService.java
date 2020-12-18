package com.demo.service;

import java.util.List;

import com.demo.model.Shoes;

public interface ShoeService {

	public Shoes addShoe(Shoes shoe);
	public Shoes updateShoe(Shoes shoe);
	public Shoes getShoeById(int id);
	public void deleteShoeById(int id);
	public List<Shoes> getAllShoes();
	public List<Shoes> getShoesByCategory(String category);
}
