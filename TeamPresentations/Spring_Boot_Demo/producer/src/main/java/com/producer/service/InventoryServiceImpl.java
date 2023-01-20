package com.producer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producer.entity.InventoryItem;
import com.producer.repository.InventoryItemRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	// DI ==> Association == aggregation == One to one / One to many == @Autowired

	@Autowired
	private InventoryItemRepository inventoryItemRepository;

	@Override
	public Optional<InventoryItem> findByProductCode(String productCode) {
		return inventoryItemRepository.findByProductCode(productCode);

	}

	@Override
	public List<InventoryItem> findAll() {

		return inventoryItemRepository.findAll();
	}

}
