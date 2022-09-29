package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
public class Controller {
	@Autowired
	Bank_newRepository repo;
	@PostMapping(value="/post_customer_details")
	public String post(@RequestBody Bank_new a) {
		repo.save(a);
		return "// Details saved //";
		}
	@GetMapping(value="/get_customer_details")
	public List<Bank_new> get(){
		repo.findAll();
		return repo.findAll();
	}

}
