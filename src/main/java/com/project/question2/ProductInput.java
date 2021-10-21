package com.project.question2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Represents Product Input class
 * Stores data input by user
 */
@Data
@AllArgsConstructor
public class ProductInput {
    private String storeNo;
    private String productId;
    private LocalDate date;
    private double reqQty;
}
