package com.example.springbootcrud.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.entitys.Product;
import com.example.springbootcrud.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;    //Inject Service method into Controller

	@PostMapping("/addSingleProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addMultipleProducts")
	public List<Product> addProduct(@RequestBody List<Product> product) {
		return service.saveProducts(product);
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}

	@GetMapping("/productById/{id}")
	public Product findById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/productByName/{name}")
	public Product findByname(@PathVariable String name) {
		return service.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {

		return service.updateProductById(product);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProductById(id);

	}

}
