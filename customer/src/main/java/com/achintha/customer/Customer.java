package com.achintha.customer;

import lombok.Builder;
import lombok.Data;

/**
 * @author Achintha Kalunayaka
 * @since 10/22/2023
 */

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
