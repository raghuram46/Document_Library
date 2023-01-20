package com.consumer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consumer.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	public abstract Optional<Product> findByCode(String code);
}
