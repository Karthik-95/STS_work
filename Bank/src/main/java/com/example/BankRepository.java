package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="select branch from karthik.bank_info where ifsc_code=:code",nativeQuery=true)
	public String getBranch(@Param("code") String code);
		
	}


