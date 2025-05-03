package com.krisna.customer_orders.repository;

import com.krisna.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krisna VJ
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
