package com.project.question2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Represents Product Availability.
 */
@Data
@AllArgsConstructor
public class ProductAvailability {
    private String storeNo;
    private String productId;
    private LocalDate date;
    private double availQty;
}
