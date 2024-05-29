package com.grocery.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.model.Product;
import com.grocery.repo.ProductRepository;
import com.grocery.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {	      	
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {	
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
		
	}

}
