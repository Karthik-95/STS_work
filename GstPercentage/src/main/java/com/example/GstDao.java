package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;
	public String addDetails(List<Gst> g) {
		gstRepo.saveAll(g);
		return "*** Details Are Saved ***";
	}
	public String update(Gst id) {
		gstRepo.save(id);
		return "*** Updated Successfully ***";
	}
	public int getgst(int code){
		return gstRepo.getgst(code);
	}

}
