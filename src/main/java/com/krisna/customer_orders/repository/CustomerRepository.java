package com.krisna.customer_orders.repository;

import com.krisna.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krisna VJ
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
