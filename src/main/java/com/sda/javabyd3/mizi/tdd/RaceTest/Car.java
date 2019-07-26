package com.sda.javabyd3.mizi.tdd.RaceTest;

/**
 * Created by Michal Ziolecki.
 */
public class Car {

    private double fuel;
    private boolean dirt;
    private int tireProblem;

    public Car(){
        this.fuel = 100.0;
        this.dirt = false;
        this.tireProblem = 100;
    }

    public void doEncirclement(int encirclement){
        levelOfFuel();
        if(encirclement % 5 == 0) dirtiness();
        tireWear();
    }

    public double levelOfFuel(){
        this.fuel -= 2.0;
        return this.fuel;
    }

    public boolean dirtiness(){
        this.dirt = true;
        return this.dirt;
    }

    public int tireWear(){
        this.tireProblem -= 1;
        return this.tireProblem;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public boolean isDirt() {
        return dirt;
    }

    public void setDirt(boolean dirt) {
        this.dirt = dirt;
    }

    public int isTireProblem() {
        return tireProblem;
    }

    public void setTireProblem(int tireProblem) {
        this.tireProblem = tireProblem;
    }
}
