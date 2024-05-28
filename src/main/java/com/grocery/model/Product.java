package com.grocery.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String category;
	    private String description;
	    private double price;

	    @OneToMany(mappedBy = "product")
	    private List<PurchaseOrder> purchaseOrder;

	    @OneToMany(mappedBy = "product")
	    private List<Stock> stocks;

	    
	    
}
