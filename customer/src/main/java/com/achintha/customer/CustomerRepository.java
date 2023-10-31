package com.achintha.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Achintha Kalunayaka
 * @since 10/31/2023
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
