package com.sda.javabyd3.mabr.zadania007;

public class MainFigure {
    public static void main(String[] args) {

        CircleParameters circleParameters = new CircleParameters();
        circleParameters.setFigureParametersFromUser();
        Circle circle = new Circle(circleParameters);
        circle.countPermiter();
        circle.countSuface();
        circle.getDetailedInfo();

        SquareParameters squareParameters = new SquareParameters();
        squareParameters.setFigureParametersFromUser();
        Square square = new Square(squareParameters);
        square.countPermiter();
        square.countSuface();
        square.getDetailedInfo();

        RectangleParameters rectangleParameters = new RectangleParameters();
        rectangleParameters.setFigureParametersFromUser();
        Rectangle rectangle = new Rectangle(rectangleParameters);
        rectangle.countPermiter();
        rectangle.countSuface();
        rectangle.getDetailedInfo();

        TriangleParameters triangleParameters = new TriangleParameters();
        triangleParameters.setFigureParametersFromUser();
        Triangle triangle = new Triangle(triangleParameters);
        triangle.countPermiter();
        triangle.countSuface();
        triangle.getDetailedInfo();
    }
}
