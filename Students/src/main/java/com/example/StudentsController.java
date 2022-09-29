package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
	@Autowired
	StudentsService stSer;
	@PostMapping(value="/add")
	public String addDetails(@RequestBody Students s) {
		return stSer.addDetails(s);
	}
	@GetMapping(value="/get/{id}")
	public Students getDetails(@PathVariable int id) {
		return stSer.getDetails(id);
	}

}
