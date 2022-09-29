package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsingJUnitApplicationTests {
	TestPrime p=new TestPrime();

	@Test
	void contextLoads() {
		p.prime(7);
	}

}
