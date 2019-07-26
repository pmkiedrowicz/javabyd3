package com.sda.javabyd3.kawa.TDD;

public enum FuelType {
    E95(6), E98(5), ON(4);

    private final int price;

    FuelType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
