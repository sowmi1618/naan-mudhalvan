package com.sowmiyasundaram.customer_orders.repository;

import com.sowmiyasundaram.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Teja K
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
