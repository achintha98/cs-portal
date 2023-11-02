package com.achintha.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Achintha Kalunayaka
 * @since 11/2/2023
 */
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
