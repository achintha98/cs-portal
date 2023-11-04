package com.achintha.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Achintha Kalunayaka
 * @since 11/4/2023
 */

@Configuration
public class CustomerConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
