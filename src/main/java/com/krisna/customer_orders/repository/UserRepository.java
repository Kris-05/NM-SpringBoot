package com.krisna.customer_orders.repository;

import com.krisna.customer_orders.model.Order;
import com.krisna.customer_orders.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Krisna VJ
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
