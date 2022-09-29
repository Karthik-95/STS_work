package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GstRepository extends JpaRepository<Gst, Integer> {
	@Query(value="select gst_percentage from product.gst_inf where hsn_code=:code",nativeQuery=true)
	public int getgst(@Param("code") int code);

}
