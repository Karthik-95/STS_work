package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bRepo;
	public String add(List<Bank> a) {
		bRepo.saveAll(a);
		return "saved";
	}
	public List<Bank> get() {
		return bRepo.findAll();
	}
	public String getBranch(String code) {
		return bRepo.getBranch(code);
	}

}
