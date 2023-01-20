package com.BatchProcessing.config;

import org.springframework.batch.item.ItemProcessor;

import com.BatchProcessing.entity.Customer;

public class CustomProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customer;
	}

}
