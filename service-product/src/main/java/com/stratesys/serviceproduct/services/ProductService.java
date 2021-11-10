package com.stratesys.serviceproduct.services;

import java.util.List;

import com.stratesys.serviceproduct.models.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Product saveProduct(Product product);
	
}
