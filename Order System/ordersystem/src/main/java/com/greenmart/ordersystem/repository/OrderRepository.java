package com.greenmart.ordersystem.repository;

import com.greenmart.ordersystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
