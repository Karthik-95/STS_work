package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Repository repo;
	@PostMapping(value="/post")
	public String post(@RequestBody Task_3 a) {
		repo.save(a);
		return "***  Details added  ***";
	}
	@GetMapping(value="/get")
	public ResponseEntity<List<Task_3>> get(){
		return new ResponseEntity<List<Task_3>>(repo.findAll(),HttpStatus.FOUND);
	}
	

}
