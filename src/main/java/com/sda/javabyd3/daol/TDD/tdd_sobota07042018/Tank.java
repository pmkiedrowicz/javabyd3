package com.sda.javabyd3.daol.TDD.tdd_sobota07042018;

import lombok.Data;

@Data
public class Tank {
    private final FuelType fuelType;
    int capacity;
    int maxCapacity;

    public Tank(int capacity, int maxCapacity) {
        this.capacity = capacity;
        this.maxCapacity = maxCapacity;
        fuelType = FuelType.E95;
    }

    public Tank(int capacity, int maxCapacity, FuelType fuelType) {
        this.capacity = capacity;
        this.maxCapacity = maxCapacity;
        this.fuelType = fuelType;
    }
}
