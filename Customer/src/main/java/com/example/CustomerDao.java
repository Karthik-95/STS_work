package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cuRepo;
	public String add(List<Customer> a) {
		cuRepo.saveAll(a);
		return "Details Are Saved";
	}
	public List<Customer> details(){
		return cuRepo.findAll();
	}

}
