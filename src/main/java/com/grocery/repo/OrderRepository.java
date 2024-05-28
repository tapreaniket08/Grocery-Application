package com.grocery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.model.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Long> {

}
