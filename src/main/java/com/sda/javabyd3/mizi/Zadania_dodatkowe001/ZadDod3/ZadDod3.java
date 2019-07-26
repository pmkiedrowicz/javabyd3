package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod3;

/**
 * Created by Michal Ziolecki.
 */
public class ZadDod3 {
    public double calculateCylinder(double h, double r)
    {
        double capacity;
        capacity = h * (Math.PI * Math.pow( r, 2 ));
        return capacity;
    }
}
