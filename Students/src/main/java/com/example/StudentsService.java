package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
	@Autowired
	StudentsDao stDao;
	public String addDetails(Students s) {
		return stDao.addDetails(s);
	}
	public Students getDetails(int id) {
		return stDao.getDetails(id);
	}

}
