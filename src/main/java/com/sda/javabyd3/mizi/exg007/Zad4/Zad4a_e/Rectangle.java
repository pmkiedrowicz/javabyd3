package com.sda.javabyd3.mizi.exg007.Zad4.Zad4a_e;

import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.Parameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.RectangleParameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.SquareParameters;

/**
 * Created by Michal Ziolecki.
 */
public class Rectangle extends  Figure {

    public Double width;
    public Double lenght;
    RectangleParameters rectangleParameters;

    public Rectangle(Parameters ObjectParameters) {
        super( ObjectParameters );
        this.type = objectParam.getTitle();
        rectangleParameters = (RectangleParameters) ObjectParameters;
        this.width = rectangleParameters.getWidth();
        this.lenght = rectangleParameters.getLength();
        this.permiterer = 0.0d;
        this.surface = 0.0d;
    }

    @Override
    public Double countPermiter() {
        permiterer = lenght * 2 + width * 2;
        return permiterer;
    }

    @Override
    public Double countSuface() {
        surface = lenght * width;
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}
