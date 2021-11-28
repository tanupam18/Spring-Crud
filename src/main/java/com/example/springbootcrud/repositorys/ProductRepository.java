package com.example.springbootcrud.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrud.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> { //Jpa repository 

	Product getByName(String name);

	
	
	
}
