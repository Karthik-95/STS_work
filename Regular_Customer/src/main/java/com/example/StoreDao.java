package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDao {
	@Autowired
	StoreRepository repo;
	public String add(List<Regular_Customer> a) {
		repo.saveAll(a);
		return "## Customer Details Are Saved ##";
	}
	public List<Regular_Customer> get(){
		return repo.findAll();
	}

}
