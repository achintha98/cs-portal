package com.achintha.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Achintha Kalunayaka
 * @since 10/22/2023
 */

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(CustomerRegistrationRequest registrationRequest) {
        log.info("New Customer Registration {}", registrationRequest);
        customerService.registerCustomer(registrationRequest);
    }

}
