package com.sda.javabyd3.mizi.exg007.Zad4.Zad4a_e;

import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.Parameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.SquareParameters;

/**
 * Created by Michal Ziolecki.
 */
public class Square extends Figure{

    Double side;
    SquareParameters squareParameters;

    public Square(Parameters ObjectParameters) {
        super( ObjectParameters );
        this.type = objectParam.getTitle();
        squareParameters = (SquareParameters) ObjectParameters;
        this.side = squareParameters.getSide();
        this.permiterer = 0.0d;
        this.surface = 0.0d;
    }

    @Override
    public Double countPermiter() {
        this.permiterer = side * 4;
        return permiterer;
    }

    @Override
    public Double countSuface() {
        this.surface = side * side;
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}
