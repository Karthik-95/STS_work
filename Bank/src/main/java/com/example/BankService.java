package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	BankDao bDao;
	public String add(List<Bank> a) {
		return bDao.add(a);
	}
	public List<Bank> get(){
		return bDao.get();
	}
	public String getBranch(String code) {
		return bDao.getBranch(code);
	}

}
