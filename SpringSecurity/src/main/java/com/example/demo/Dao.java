package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Dao {
	@Autowired
	CarRepository rep;
	public String save(Car c) {
		rep.save(c);
		return "----Car Details Saved----";
	}

}
