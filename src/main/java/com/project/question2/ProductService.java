package com.project.question2;

import java.time.LocalDate;

/**
 * This is interface class
 */
public interface ProductService {

    void setCapacity();
    void setAvailability();
    String getProductAvailability(LocalDate date);
}
