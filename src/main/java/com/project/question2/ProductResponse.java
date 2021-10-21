package com.project.question2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Represents product response class
 * Output data is stored in this class.
 */
@Data
@AllArgsConstructor
public class ProductResponse {

    private String storeNo;
    private String productId;
    private LocalDate date;
    private double reqQty;
    private String status;
}
