package com.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.entity.Product;
import com.consumer.service.ProductService;

@RestController
@RequestMapping("/consumer")
public class Consumer {
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public List<Product> allProducts() {
		return productService.findAllProducts();
	}

	@GetMapping("/{code}")
    public Product productByCode(@PathVariable String code) {
           return productService.readProductByCode(code);
        		   
  // .orElseThrow(() -> new ProductNotFoundException("Product with code ["+code+"] doesn't exist"));
    }
}
