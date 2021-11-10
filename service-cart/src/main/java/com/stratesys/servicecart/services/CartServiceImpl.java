package com.stratesys.servicecart.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stratesys.servicecart.dtos.CartDto;
import com.stratesys.servicecart.dtos.ProductDto;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CartDto> findAll() {
		// TODO Auto-generated method stub
		List<ProductDto> products=Arrays.asList(restTemplate.getForObject("http://localhost:8001/product/all", ProductDto[].class));
							
		return products.stream().map(product -> new CartDto(product,1)).collect(Collectors.toList());
	
	}
}
