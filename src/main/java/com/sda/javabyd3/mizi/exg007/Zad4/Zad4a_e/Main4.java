package com.sda.javabyd3.mizi.exg007.Zad4.Zad4a_e;

import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.CircleParameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.RectangleParameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.SquareParameters;
import com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h.TriangleParameters;

/**
 * Created by Michal Ziolecki.
 */
public class Main4 {
    public static void main(String[] args) {

        // utworzenie kola
        /*CircleParameters circleParameters = new CircleParameters();
        circleParameters.setFigureParametersFromUser();
        Circle circle = new Circle( circleParameters );
        circle.countPermiter();
        circle.countSuface();
        circle.getDetailedInfo();*/

        //utworzenie kwadratu
        /*SquareParameters squareParameters= new SquareParameters();
        squareParameters.setFigureParametersFromUser();
        Square square = new Square( squareParameters );
        square.countPermiter();
        square.countSuface();
        square.getDetailedInfo();*/

        /*RectangleParameters rectangleParameters= new RectangleParameters();
        rectangleParameters.setFigureParametersFromUser();
        Rectangle rectangle= new Rectangle( rectangleParameters);
        rectangle.countPermiter();
        rectangle.countSuface();
        rectangle.getDetailedInfo();*/

        TriangleParameters triangleParameters= new TriangleParameters();
        triangleParameters.setFigureParametersFromUser();
        Triangle triangle= new Triangle( triangleParameters);
        triangle.countPermiter();
        triangle.countSuface();
        triangle.getDetailedInfo();

    }
}
