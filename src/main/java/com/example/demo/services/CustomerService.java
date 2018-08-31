package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

public class CustomerService {
	CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Transactional
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	// updates a list of customers
	@Transactional
	public List<Customer> updateCustomers(List<Customer> customers) {
		for (Customer customer : customers) {
			Customer customerToUpdate = customerRepository.findById(customer.getCustomerId()).get();
			customerToUpdate.setFirstName(customer.getFirstName());
			customerToUpdate.setLastName(customer.getLastName());
			customerRepository.save(customerToUpdate);
		}
		return customers;
	}

	// creates a new list of customers
	@Transactional
	public List<Customer> createCustomers(List<Customer> customers) {
		return (List<Customer>) customerRepository.saveAll(customers);
	}

	// deletes a list of customers
	@Transactional
	public void deleteCustomers(List<Customer> customers) {
		customerRepository.deleteAll(customers);
	}
}
