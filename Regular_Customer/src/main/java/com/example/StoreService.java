package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
	@Autowired
	StoreDao dao;
	public String add(List<Regular_Customer> a) {
		return dao.add(a);
		
	}
	public List<Regular_Customer> get(){
		return dao.get();
	}

}
