package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;
	public Product getDetails(int id) {
		return proRepo.findById(id).get();
	}
	public List<Product>getDetailsAll(){
		return proRepo.findAll();
	}
	public String update(Product id) {
		proRepo.save(id);
		return "** Updated Successfully ***";
	}
	public List<Product> getByprice(int price1,int price2){
		return proRepo.getByprice(price1, price2);
	}
	public List<String> getByname(int price1,int price2){
		return proRepo.getByname(price1, price2);
	}

}
