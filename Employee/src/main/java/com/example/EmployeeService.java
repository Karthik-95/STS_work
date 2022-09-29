package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String addDetails(Employee e) {
		return empDao.addDetails(e);
	}
	public Employee getDetails(int id) {
		return empDao.getDetails(id);
	}
	public List<Employee>getDetailsAll(){
		return empDao.getDetailsAll();
	}
	public String deleteId(int id) {
		return empDao.deleteId(id);
	}
	public String update(Employee id) {
		return empDao.update(id);
	}

}
