package com.example.springbootcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrud.entitys.Product;
import com.example.springbootcrud.repositorys.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repo.saveAll(products);
	}
	
	public List<Product> getAllProduct() {
		return repo.findAll();
	}
	public Product getProductById(int id) {
		return repo.getById(id);
	}
	
	public Product getProductByName(String name) {
		return repo.getByName(name);
	}
	
	public String deleteProductById(int id) {
		 repo.deleteById(id);
		 return "delete product successfully";
	}
	public Product updateProductById(Product product) {
		Product exisiting = repo.findById(product.getId()).orElse(null);
		exisiting.setName(product.getName());
		exisiting.setPrice(product.getPrice());
		exisiting.setQuantity(product.getQuantity());
		return repo.save(exisiting);
		
	}
	
}
