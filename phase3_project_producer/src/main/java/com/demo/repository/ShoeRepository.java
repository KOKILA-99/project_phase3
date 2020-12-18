package com.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Shoes;
@Repository
public interface ShoeRepository extends JpaRepository<Shoes,Integer> {
	
	public List<Shoes> findByCategory(String category);

}
