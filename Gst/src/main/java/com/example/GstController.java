package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GstController {
	@Autowired
	GstService gstSer;
	@PostMapping(value="/addDetails")
	public String addDetails(@RequestBody List<Gst> g) {
		return gstSer.addDetails(g);
	}
	@GetMapping(value="/getDetailsAll")
	public List<Gst>getDetailsAll(){
		return gstSer.getDetailsAll();
	}
	@PostMapping(value="/addDetails/{id}")
	public String add(@PathVariable Gst id) {
		return gstSer.add(id);
	}
	

}
