package com.newpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newpro.model.Customer;
import com.newpro.service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class CustomerController {
	@Autowired
	CustomerService custSer;
	@Tag(name="getAllOrderDetails",description="getAll")
	
	@GetMapping("/getAllCustomers")
	public List<Customer> fetchAllCustomers() {
		List<Customer> pList=custSer.fetchAllCustomers();
		return pList;
	}
	
	@PostMapping("/saveCustomers") 
	public Customer saveCustomers(@RequestBody Customer p) {
		return custSer.saveCustomers(p);
	}

}