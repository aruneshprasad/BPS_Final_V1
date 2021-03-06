package com.BPS.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.BPS.customer.entities.Country;

public interface CustomerCountryDao extends JpaRepository<Country, String>{
	
	@Query(value="select * from country c where c.country = :cParam", nativeQuery=true)
	List<Country> findByCountryName(@Param("cParam") String country);
	
	@Query(value="select * from country c where c.country = :cParam and c.state = :cState", nativeQuery=true)
	List<Country> findCountryId(@Param("cParam") String country, @Param("cState") String state);

}
