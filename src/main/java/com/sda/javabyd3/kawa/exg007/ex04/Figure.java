package com.sda.javabyd3.kawa.exg007.ex04;

public class Figure {

    String type;
    Parameters parameters;
    double permiter;
    double surface;

    public Figure(Parameters parameters) {
        this.parameters = parameters;
        this.permiter = permiter;
        this.surface = surface;
        this.type = parameters.getType();
    }

    public double countPermiter() {
        double permiter = 0.0;
        return permiter;
    }

    public double countSurface() {
        double surface = 0.0;
        return surface;
    }

    public void getDetailedInfo (){
        System.out.println("Figura - " + type + ", parametry - " + parameters + ", obwod - " + permiter + ", " +
                "powierzchnia - " +
                surface + ".");
    }
}
