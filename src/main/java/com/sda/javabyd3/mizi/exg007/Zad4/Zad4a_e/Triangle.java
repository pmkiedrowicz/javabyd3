package com.sda.javabyd3.mizi.exg007.Zad4.Zad4a_e;

import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.Parameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.RectangleParameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.TriangleParameters;

/**
 * Created by Michal Ziolecki.
 */
public class Triangle extends Figure{

    Double basis;
    Double height;
    TriangleParameters triangleParameters;

    public Triangle(Parameters ObjectParameters) {
        super( ObjectParameters );
        this.type = objectParam.getTitle();
        triangleParameters = (TriangleParameters) ObjectParameters;
        this.basis = triangleParameters.getBasis();
        this.height = triangleParameters.getHeight();
        this.permiterer = 0.0d;
        this.surface = 0.0d;
    }

    @Override
    public Double countPermiter() {
        // trojkat rownoramienny
        Double halfOfBasis = basis/2.0d;
        Double side = Math.sqrt( halfOfBasis * halfOfBasis + height * height );
        this.permiterer = basis + side + side;
        return permiterer;
    }

    @Override
    public Double countSuface() {
        this.surface = (basis * height) / 2.0;
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}
