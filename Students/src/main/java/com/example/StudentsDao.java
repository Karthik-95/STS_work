package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsDao {
	@Autowired
	StudentsRepository stRepo;
	public String addDetails(Students s) {
		stRepo.save(s);
		return "*** Details are Saved ***";
	}
	public Students getDetails(int id) {
		return stRepo.findById(id).get();
	}

}
