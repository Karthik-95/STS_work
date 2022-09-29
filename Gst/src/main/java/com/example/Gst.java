package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gst")

public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hsn_code;
	private int gst_percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHsn_code() {
		return hsn_code;
	}
	public void setHsn_code(int hsn_code) {
		this.hsn_code = hsn_code;
	}
	public int getGst_percentage() {
		return gst_percentage;
	}
	public void setGst_percentage(int gst_percentage) {
		this.gst_percentage = gst_percentage;
	}

}
