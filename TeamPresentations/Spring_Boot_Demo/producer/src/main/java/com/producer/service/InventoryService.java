package com.producer.service;

import java.util.List;
import java.util.Optional;

import com.producer.entity.InventoryItem;

public interface InventoryService {

	public abstract Optional<InventoryItem> findByProductCode(String productCode);

	public abstract List<InventoryItem> findAll();
}
