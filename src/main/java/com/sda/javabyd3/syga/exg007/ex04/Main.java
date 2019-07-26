package com.sda.javabyd3.syga.exg007.ex04;

public class Main {
    public static void main(String[] args) {


        /**
         * Square
         */
        SquareParameters squareParameters = new SquareParameters();
        squareParameters.getFigureParametersFromUser();
        Square square = new Square(squareParameters);
        square.countPermiterer();
        square.countSurface();
        square.getDetailedInfo();

        /**
         * Circle
         */
//        CircleParameters circleParameters = new CircleParameters();
//        circleParameters.getFigureParametersFromUser();
//        Circle circle = new Circle(circleParameters);
//        circle.countPermiterer();
//        circle.countSurface();
//        circle.getDetailedInfo();

        /**
         * Rectangle
         */
//        RectangleParameters rectangleParameters = new RectangleParameters();
//        rectangleParameters.getFigureParametersFromUser();
//        Rectangle rectangle = new Rectangle(rectangleParameters);
//        rectangle.countPermiterer();
//        rectangle.countSurface();
//        rectangle.getDetailedInfo();

        /**
         * Triangle
         */
//        TriangleParameters triangleParameters = new TriangleParameters();
//        triangleParameters.getFigureParametersFromUser();
//        Triangle triangle = new Triangle(triangleParameters);
//        triangle.countPermiterer();
//        triangle.countSurface();
//        triangle.getDetailedInfo();
    }
}
