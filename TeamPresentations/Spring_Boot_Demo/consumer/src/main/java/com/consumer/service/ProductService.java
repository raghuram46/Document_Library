package com.consumer.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.consumer.entity.Product;

public interface ProductService {
	public abstract Product addProduct(Product product);

	public abstract Product readProductById(Long productId);

	public abstract Product readProductByCode(String productCode);

	public List<Product> findAllProducts();

	public abstract Optional<Product> FindProductByCode(String code);

	public abstract Product updateProduct(Product product);

	public abstract Long deleteProductById(Long productId);

	public abstract Map<String, Integer> getInventory();
}
