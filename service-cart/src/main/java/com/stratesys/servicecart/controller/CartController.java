package com.stratesys.servicecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stratesys.servicecart.dtos.CartDto;
import com.stratesys.servicecart.services.CartService;

@RestController
@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	
	@GetMapping("/cart")
	public List<CartDto> findAll(){
		return cartService.findAll();				
	}
	
}
