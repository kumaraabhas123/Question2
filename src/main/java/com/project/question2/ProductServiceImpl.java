package com.project.question2;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private static final List<ProductCapacity> CapacityList = new ArrayList<>();
    private static final List<ProductAvailability> AvailabilityList = new ArrayList<>();

    /**
     * Sets capacity of products along with store no, product id and date
     * Stores data in CapacityList
     */
    @Override
    public void setCapacity(){
        CapacityList.add(new ProductCapacity("Store001", "Prod1", LocalDate.of(2021,02,19), 0));
        CapacityList.add(new ProductCapacity("Store001", "Prod1", LocalDate.of(2021,02,20), 2.0));
        CapacityList.add(new ProductCapacity("Store001", "Prod1", LocalDate.of(2021,02,21), 2.0));
        CapacityList.add(new ProductCapacity("Store001", "Prod1", LocalDate.of(2021,02,22), 0));

    }
    /**
     * Sets availability of products along with store no, product id and date
     * Stores data in AvailabilityList
     */
    @Override
    public void setAvailability(){
        AvailabilityList.add(new ProductAvailability("Store001", "Prod1", LocalDate.of(2021,02,19), 1.0));
        AvailabilityList.add(new ProductAvailability("Store001", "Prod2", LocalDate.of(2021,02,20), 3.0));
        AvailabilityList.add(new ProductAvailability("Store001", "Prod2", LocalDate.of(2021,02,21), 0));

    }

    /**
     * Gets the product availability status
     *
     * Filter availQty from AvailabilityList on date input by user and stores in availability,
     * Filter noOfOrderAccepted from CapacityList on date input by user and stores in capacity,
     * Then compare and check, if the product is available on given date or not.
     *
     * @param date A date input by user to check product availability.
     * @return the status of availability of product
     */
    public String getProductAvailability(LocalDate date) {

        double availability=0;
        availability= AvailabilityList.stream().filter(i -> i.getDate().equals(date)).mapToDouble(i-> i.getAvailQty()).sum();

        double capacity=0;
        capacity= CapacityList.stream().filter(i -> i.getDate().equals(date)).mapToDouble(i -> i.getNoOfOrderAccepted()).sum();

        if(availability==0 && capacity==0){
            return "No Content";
        }
        else if(capacity==0){
            return "No Capacity";
        }
        else if(availability==0){
            return "No Availability";
        }
        else
            return "Available";
    }
}
