package com.grocery.service;

import java.util.List;

import com.grocery.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(long id);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(long id);
	
	
	
	
}
