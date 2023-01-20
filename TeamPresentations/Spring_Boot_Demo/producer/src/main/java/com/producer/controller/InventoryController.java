package com.producer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.entity.InventoryItem;
import com.producer.service.InventoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/producerapi") // End point URI
@Slf4j
public class InventoryController {

	// DI interface var = new InterfaceImp() ; Abstraction
	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/inventory/{productCode}")
	public ResponseEntity<InventoryItem> findInventoryByProductCode(@PathVariable("productCode") String productCode) {

		Optional<InventoryItem> inventoryItem = inventoryService.findByProductCode(productCode);
		if (inventoryItem.isPresent()) {
			return new ResponseEntity(inventoryItem, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/inventory")
	public List<InventoryItem> getInventory() {
		return inventoryService.findAll();
	}
}
