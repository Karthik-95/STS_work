package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	public Product getDetails(int id) {
		return proDao.getDetails(id);
	}
	public List<Product>getDetailsAll(){
		return proDao.getDetailsAll();
	}
	public String update(Product id) {
		return proDao.update(id);
	}
	public List<Product> getByprice(int price1,int price2){
		return proDao.getByprice(price1, price2);
	}
	public List<String> getByname(int price1,int price2){
		return proDao.getByname(price1, price2);
				
	}

}
