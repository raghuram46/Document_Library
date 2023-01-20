package com.consumer.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumer.entity.Product;
import com.consumer.entity.ProductInventoryResponse;
import com.consumer.exception.ProductNotFoundException;
import com.consumer.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	// DI
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Product addProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public Product readProductById(Long productId) {
		Product product = null;
		Optional<Product> productOptional = productRepository.findById(productId);
		if (productOptional.isPresent()) {
			product = productOptional.get();

			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ProductInventoryResponse response = restTemplate.exchange(
					"http://localhost:9091/inventoryserviceproducer/producerapi/inventory/" + product.getName(),
					HttpMethod.GET, entity, ProductInventoryResponse.class).getBody();
			product.setAvailableQuantity(response.getAvailableQuantity());

		} else {
			throw new ProductNotFoundException("Product not found : " + productId);
		}

		return product;
	}

	@Override
	public Product readProductByCode(String productCode) {
		Product product = null;
		Optional<Product> productOptional = productRepository.findByCode(productCode);
		if (productOptional.isPresent()) {
			product = productOptional.get();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<>(headers);

			ProductInventoryResponse response = restTemplate.exchange(
					"http://localhost:9091/inventoryserviceproducer/producerapi/inventory/" + product.getName(),
					HttpMethod.GET, entity, ProductInventoryResponse.class).getBody();
			product.setAvailableQuantity(response.getAvailableQuantity());
		} else {
			throw new ProductNotFoundException("Product not found : " + productCode);
		}
		return product;
	}

	@Override
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Long deleteProductById(Long productId) {
		productRepository.deleteById(productId);
		return productId;
	}

	@Override
	public Map<String, Integer> getInventory() {
		// inventoryServiceFeignClient..getData(id);
		return null;
	}

	@Override
	public Optional<Product> FindProductByCode(String code) {
		Optional<Product> productOptional = productRepository.findByCode(code);
		return productOptional;
	}

}
