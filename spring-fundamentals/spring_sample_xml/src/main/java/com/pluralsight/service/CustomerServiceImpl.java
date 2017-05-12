package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public CustomerServiceImpl(CustomerRepository customerRepository1) {
		// TODO Auto-generated constructor stub
		this.customerRepository = customerRepository1;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
