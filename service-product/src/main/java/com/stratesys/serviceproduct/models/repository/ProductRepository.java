package com.stratesys.serviceproduct.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.stratesys.serviceproduct.models.entity.Product;
//En T, se pone el modelo y en el otro se pone el tio de dato
public interface ProductRepository extends CrudRepository<Product, Long>{

}
