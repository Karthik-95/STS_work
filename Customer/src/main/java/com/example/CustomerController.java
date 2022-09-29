package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
	@Autowired
	RestTemplate restTemp;
	@Autowired
	CustomerService cuSer;
	@PostMapping(value="/addCustomer")
	public String add(@RequestBody List<Customer> a) {
		String url1="http://localhost:8081/getBranch/";
		a.forEach(x->{
			String ifsc_code=x.getIfsc_code();
			ResponseEntity<String> response=restTemp.exchange(url1+ifsc_code, HttpMethod.GET, null, String.class);
			String branch = response.getBody();
			x.setBranch(branch);
		});
		return cuSer.add(a);
	}
	@GetMapping("/getCustomersDetails")
	public List<Customer> details(){
		return cuSer.details();
	}
	

}
