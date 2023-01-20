package com.BatchProcessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BatchProcessing.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
