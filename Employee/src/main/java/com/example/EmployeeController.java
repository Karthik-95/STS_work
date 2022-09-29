package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empSer;
	@PostMapping(value="/add")
	public String addDetails(@RequestBody Employee e) {
		return empSer.addDetails(e);
	}
	@GetMapping(value="/get/{id}")
	public Employee getDetails(@PathVariable int id) {
		return empSer.getDetails(id);
	}
	@GetMapping(value="/getDetailsAll")
	public List<Employee> getDetailsAll(){
		return empSer.getDetailsAll();
	}
	@DeleteMapping(value="/deleteId/{id}")
	public String deleteId(@PathVariable int id) {
		return empSer.deleteId(id);                                                                   
	}
	@PutMapping(value="/updateId/{id}")
	public String update(@RequestBody Employee id) {
		return empSer.update(id);
		
	}
	

}
