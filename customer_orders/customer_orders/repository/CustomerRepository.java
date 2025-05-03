package com.sowmiyasundaram.customer_orders.repository;

import com.sowmiyasundaram.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Teja K
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
