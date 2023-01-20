package com.producer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producer.entity.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

	public abstract Optional<InventoryItem> findByProductCode(String productCode);
}
