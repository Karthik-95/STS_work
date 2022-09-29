package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cuDao;
	public String add(List<Customer> a) {
		return cuDao.add(a);
	}
	public List<Customer> details(){
		return cuDao.details();
	}

}
