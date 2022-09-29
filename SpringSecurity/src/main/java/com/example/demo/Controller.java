package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	@Autowired
	Service ser;
	@PostMapping(value="/save")
	public String save(@RequestBody Car c) {
		return ser.save(c);
	}

}
