package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;

/*	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
*/
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(this.dbUsername);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("Frank");
		customer.setLastname("Li");

		customers.add(customer);

		return customers;
	}
}
