package com.pluralsight.tests;

import org.junit.Test;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

public class serviceTest {

	@Test
	public void test(){
		assertEquals(true, true);
	}
	
	@Test
	public void SomeShouldWork(){
		CustomerRepository repo = new HibernateCustomerRepositoryImpl();
		List<Customer> result = repo.findAll();
		
		int size = result.size();
		
		List<Customer> filtered = result.stream().filter(c -> c.getLastname() == "Li").collect(Collectors.toList());
		
		assertEquals(1, size);
		assertEquals(1, filtered.size());
		
	}
}
