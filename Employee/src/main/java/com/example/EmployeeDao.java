package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addDetails(Employee e) {
		empRepo.save(e);
		return "Successfully Saved";
	}
	public Employee getDetails(int id) {
		return empRepo.findById(id).get();
	}
	public List<Employee> getDetailsAll(){
		return empRepo.findAll();
	}
	public String deleteId(int id) {
		empRepo.deleteById(id);
		return "Deleted Successfully";
	}
	public String update(Employee id) {
		empRepo.save(id);
		return "Updated";
	}

}
