package com.sda.javabyd3.mizi.exg007.Zad4.Zad4a_e;

import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.Parameters;

/**
 * Created by Michal Ziolecki.
 */
public abstract class Figure {
    public String type;
    public Double permiterer;
    public Double surface;
    Parameters objectParam;

    public Figure(Parameters ObjectParameters)
    {
        this.objectParam = ObjectParameters;
        this.type = objectParam.getTitle();
        this.permiterer = 0.0d;
        this.surface = 0.0d;
    }

    public Double countPermiter(){
        Double permiter = 0.0d;

        return permiter;
    }

    public Double countSuface()
    {
        Double surface = 0.0d;

        return surface;
    }

    public void getDetailedInfo()
    {
        System.out.println("Name: " + type + " ,permiterer: " + permiterer + " ,surface: " + surface);
    }
}
