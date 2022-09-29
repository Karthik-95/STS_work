package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDao dao;
	public String add(Order a) {
		return dao.add(a);
	}

}
