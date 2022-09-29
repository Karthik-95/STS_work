package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProductController {
	@Autowired
	RestTemplate restTemp;
	@GetMapping(value="/getProducts")
	public List<Product> getAllProduct(){
		String url1="http://localhost:8080/getProduct";
		String url2="http://localhost:8081/getgst/";
		ResponseEntity<List<Product>> response1=restTemp.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference <List<Product>>() {});
		List<Product> Products=response1.getBody();
		Products.forEach(x->{
			int hsn=x.getHsn_code();
			ResponseEntity<Integer>response2=restTemp.exchange(url2+hsn, HttpMethod.GET, null, Integer.class);
			Integer percentage=response2.getBody();
			x.setPrice(x.getPrice()+x.getPrice()*percentage/100);
		});
		return Products;
	}

}
