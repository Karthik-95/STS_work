package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;
	public List<Gst>getDetailsAll(){
		return gstRepo.findAll();
	}
	public String addDetails(List<Gst> g) {
		gstRepo.saveAll(g);
		return "*** Details Are Saved Successfully ***";
	}
	public String add(Gst id) {
		gstRepo.save(id);
		return "updated";
	}

}
