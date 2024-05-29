package com.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.Product;
import com.grocery.serviceimpl.ProductServiceImpl;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	
	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product newProduct = productServiceImpl.addProduct(product);
		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
	}
	
	@GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<List<Product>>(productServiceImpl.getAllProducts(), HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return new ResponseEntity<Product>(productServiceImpl.getProductById(id), HttpStatus.OK);
    }
	@PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return new ResponseEntity<Product>(productServiceImpl.updateProduct(product), HttpStatus.OK); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productServiceImpl.deleteProduct(id);
        return new ResponseEntity<String>("Product is deleted",HttpStatus.OK);
    }

}
