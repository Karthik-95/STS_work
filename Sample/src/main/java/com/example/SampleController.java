package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping(value="/hi")
	public String setHello() {
		return "Hello Karthik";
	}
	@GetMapping(value="/add/{num1}/{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
		
	}
	@GetMapping(value="/num/{num1}/{num2}")
	public String num(@PathVariable int num1,@PathVariable int num2) {
		if(num1>num2) {
			return "Maximum Number = "+num1;
		}
		else {
			return "Maximum Number = "+num2;
		}
	}
	@GetMapping(value="/numbers/{num1}/{num2}")
	public List<Integer> numbers(@PathVariable int num1,@PathVariable int num2) {
		ArrayList<Integer>num=new ArrayList<>();
		for(int i=num1;i<=num2;i++) {
			num.add(i);
		}
		return num;
		
		}
	@GetMapping(value="/odd/{num1}/{num2}")
	public List<Integer> odd(@PathVariable int num1,@PathVariable int num2) {
		List<Integer>odd=new ArrayList<>();
		for(int i=num1;i<=num2;i++) {
			if(i%2!=0) {
			odd.add(i);
				
			}
		}
		return odd;
	}
	@GetMapping(value="/prime/{num1}/{num2}")
	public void prime(@PathVariable int num1,@PathVariable int num2) {
		for(int i=num1;i<=num2;i++) {
			if(i%)
		}
	}
	}



