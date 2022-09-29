package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@Autowired
	BankService bSer;
	@PostMapping(value="/add")
	public String add(@RequestBody List<Bank> a) {
		return bSer.add(a);
	}
	@GetMapping(value="/get")
	public List<Bank> get(){
		return bSer.get();
	}
	@GetMapping("/getBranch/{code}")
	public String getBranch(@PathVariable String code) {
		return bSer.getBranch(code);
	}
	@GetMapping("/getCount")
	public Long getCount() {
		return bSer.getCount();
	}

}
