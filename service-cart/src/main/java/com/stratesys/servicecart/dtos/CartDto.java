package com.stratesys.servicecart.dtos;

import java.util.Objects;

public class CartDto {                           
	private ProductDto productDto;
	private Integer amount;
	
	public CartDto() {
		
	}
	
	public CartDto(ProductDto productDto, Integer amount) {
		this.productDto=productDto;
		this.amount=amount;
	}
	
	
	public ProductDto getProductDto() {
		return productDto;
	}
	public void setProductDto(ProductDto productDto) {
		this.productDto = productDto;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, productDto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartDto other = (CartDto) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(productDto, other.productDto);
	}
	@Override
	public String toString() {
		return "CartDto [productDto=" + productDto + ", amount=" + amount + "]";
	}
	/*
	  
	 
	public Double getTotal() {
		return productDto.
	}
	* */
}
