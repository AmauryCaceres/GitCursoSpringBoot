package com.stratesys.servicecart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.stratesys.servicecart.dtos.CartDto;

public interface CartService {
	
	@GetMapping("/cart")
	public List<CartDto> findAll();
}
