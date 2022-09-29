package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;
	public String save(Car c) {
		return dao.save(c);
	}

}
