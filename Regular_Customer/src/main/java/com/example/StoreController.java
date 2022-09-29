package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	@Autowired
	StoreService ser;
	@PostMapping(value="/customer_details")
	public String add(@RequestBody List<Regular_Customer> a) {
		return ser.add(a);
	}
	@GetMapping(value="/get_customer_details")
	public List<Regular_Customer> get(){
		return ser.get();
	}

}
