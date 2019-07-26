package com.sda.javabyd3.urdu.TDD;

public class Tank {
    
    private double status;
    private double capacity;
    
    public Tank(double status, double capacity) {
        this.status = status;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public boolean isFull(){
        return (status == capacity);
    }
}
