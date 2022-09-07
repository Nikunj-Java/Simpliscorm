package com.simplilearn.demo;

import java.util.Arrays;

public class ProductNotFoundException extends Exception {

	
	public ProductNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [NOT FOUND WITH ID 0]";
	}
	
	
}
