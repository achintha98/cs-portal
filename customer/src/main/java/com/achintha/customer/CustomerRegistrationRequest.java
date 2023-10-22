package com.achintha.customer;

/**
 * @author Achintha Kalunayaka
 * @since 10/22/2023
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
