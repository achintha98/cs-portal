package com.achintha.customer;

import org.springframework.stereotype.Service;

/**
 * @author Achintha Kalunayaka
 * @since 10/22/2023
 */

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest registrationRequest) {
        Customer customer = Customer.builder()
                .firstName(registrationRequest.firstName())
                .lastName(registrationRequest.lastName())
                .email(registrationRequest.email())
                .build();
    }
}
