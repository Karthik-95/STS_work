package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value="SELECT * FROM product WHERE price>=:price1 AND price<=:price2",nativeQuery=true)
	public List<Product> getByprice(@Param("price1") int price1,@Param("price2") int price2);
	@Query(value="SELECT name FROM product WHERE price<=:price1 AND price>=:price2",nativeQuery=true)
	public List<String> getByname(@Param("price1") int price1,@Param("price2") int price2);
}

