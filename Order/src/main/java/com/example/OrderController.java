package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	@Autowired
	OrderService ser;
	@Autowired
	RestTemplate restTemp;
	@PostMapping(value="/order")
	public String add(@RequestBody Order a) {
		String url="http://localhost:8080/get_customer_details";
		ResponseEntity<List<Customer>>l=restTemp.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference <List<Customer>> () {});
		List<Customer>k=l.getBody();
		k.forEach(x->{
			if(x.getCustomer_id()==a.getCustomer_id()) {
				a.setPurchase_value(a.getPurchase_value()-a.getPurchase_value()*5/100);
			}
		});
		return ser.add(a);
	}

}
