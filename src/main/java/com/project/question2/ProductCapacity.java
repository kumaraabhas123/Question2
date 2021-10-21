package com.project.question2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Represents capacity of products
 */
@Data
@AllArgsConstructor
public class ProductCapacity {
    private String storeNo;
    private String productId;
    private LocalDate date;
    private double noOfOrderAccepted;

}
