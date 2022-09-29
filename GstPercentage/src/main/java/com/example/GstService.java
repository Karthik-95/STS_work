package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public String addDetails(List<Gst> g) {
		return gstDao.addDetails(g);
	}
	public String update(Gst id) {
		return gstDao.update(id);
	}
	public int getgst(int code){
		return gstDao.getgst(code);
	}
	

}
