package com.consumer.exception;

public class ProductNotFoundException extends RuntimeException {
	private String errorMessage;

	public ProductNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return this.errorMessage;
	}

}
