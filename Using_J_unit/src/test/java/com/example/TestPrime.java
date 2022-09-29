package com.example;

public class TestPrime {
	public String prime(int num) {
		boolean a=false;
		for(int i=1;i<num;i++) {
		if(i%2!=0) {
			a=true;
		}
		else {
			a=false;
		}
	}
		if(a) {
			return "Prime";
		}
		else {
			return "Not Prime";
		}
	}

}
