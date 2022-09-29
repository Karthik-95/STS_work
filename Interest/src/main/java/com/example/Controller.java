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
	Int_Repository repo;
	@PostMapping(value="/post_interest")
	public String post(@RequestBody List<Interest> a) {
		String url="http://localhost:8080/get_"
		repo.saveAll(a);
		return "// details saved //";
	}
	@GetMapping()
	

}
