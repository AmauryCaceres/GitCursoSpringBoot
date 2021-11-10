package com.stratesys.serviceproduct.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stratesys.serviceproduct.models.entity.Product;
import com.stratesys.serviceproduct.services.ProductService;
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Product> findAll(){
		 
		 return productService.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> saveProduct(@RequestBody Product product){
						
		return ResponseEntity.status(HttpStatus.OK).body(productService.saveProduct(product));
		
	}
}
