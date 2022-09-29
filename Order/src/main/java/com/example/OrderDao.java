package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository repo;
	public String add(Order a) {
		repo.save(a);
		return "## Order Saved ##";
	}

}
