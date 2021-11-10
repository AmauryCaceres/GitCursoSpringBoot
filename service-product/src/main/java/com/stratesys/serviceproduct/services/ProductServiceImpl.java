package com.stratesys.serviceproduct.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stratesys.serviceproduct.models.entity.Product;
import com.stratesys.serviceproduct.models.repository.ProductRepository;

@Service//En las implementaciones Impl, es necesario esta anotacion
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
		
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		
		return productRepository.save(product);
	}
	
}
