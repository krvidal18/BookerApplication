package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	//working
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	//working
	@DeleteMapping
	public void deleteCustomers(@RequestBody List<Customer> customers) {
		customerService.deleteCustomers(customers);
	}
	
	@PutMapping
	public List<Customer> updateCustomers(@RequestBody List<Customer> customers) {
		return customerService.updateCustomers(customers);
	}
	
	//working
	@PostMapping
	public List<Customer> createCustomers(@RequestBody List<Customer> customers) {
		return customerService.createCustomers(customers);
	}
	
}
