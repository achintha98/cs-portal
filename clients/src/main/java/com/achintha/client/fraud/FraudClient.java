package com.achintha.client.fraud;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Achintha Kalunayaka
 * @since 11/13/2023
 */

@FeignClient(
        value = "fraud",
        path = "api/v1/fraud-check"
)
public interface FraudClient {
}
