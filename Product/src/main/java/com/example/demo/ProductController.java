package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService proSer;
	@GetMapping(value="/getDetails/{id}")
	public Product getDetails(@PathVariable int id) {
		return proSer.getDetails(id);
	}
	@GetMapping(value="/getProduct")
	public List<Product>getDetailsAll(){
		return proSer.getDetailsAll();
	}
	@PutMapping(value="/update/{id}")
	public String update(@RequestBody Product id) {
		return proSer.update(id);
	}
	@GetMapping(value="/get/{price1}/{price2}")
	public List<Product> getByprice(@PathVariable int price1,@PathVariable int price2){
		return proSer.getByprice(price1, price2);
	}
	@GetMapping(value="get_name/{price1}/{price2}")
	public List<String> getByname(@PathVariable int price1,@PathVariable int price2){
		return proSer.getByname(price1, price2);
	}

}
