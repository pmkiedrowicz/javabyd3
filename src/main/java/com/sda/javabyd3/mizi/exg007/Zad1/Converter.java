package com.sda.javabyd3.mizi.exg007.Zad1;

/**
 * Created by Michal Ziolecki.
 */
public class Converter {
    public Double celciusToFehrenheit(Double celcius)
    {
        Double fehrenheit = celcius * 1.8d + 32.0d;

        return fehrenheit;
    }

    public Double fehrenheitToCelcius(Double fehrenheit){
        Double celcius = (fehrenheit - 32.0d)/1.8d;

        return celcius;
    }
}
