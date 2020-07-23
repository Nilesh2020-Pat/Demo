package com.example.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findByFirstName(String FirstName);
	List<Customer> findAll();

}
