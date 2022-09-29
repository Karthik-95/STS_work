package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public List<Gst>getDetailsAll(){
		return gstDao.getDetailsAll();
	}
	public String addDetails(List<Gst> g) {
		return gstDao.addDetails(g);
	}
	public String add(Gst id) {
		return gstDao.add(id);
		
	}

}
