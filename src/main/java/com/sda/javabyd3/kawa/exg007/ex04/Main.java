package com.sda.javabyd3.kawa.exg007.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz figure (okrag, prostokat, kwadrat lub trojkat) dla ktorej obliczyc obwod i " +
                "powierzchnie:");
        String scanFigureName = scanner.nextLine();
        if (scanFigureName.equals("okrag")){
            CircleParameters circleParameters = new CircleParameters();
            circleParameters.scanParameters();
            Circle circle = new Circle(circleParameters);
            circle.countPermiter();
            circle.getDetailedInfo();

        }else if (scanFigureName.equals("prostokat")){
            RectangleParameters rectangleParameters = new RectangleParameters();
            rectangleParameters.scanParameters();
            Rectangle rectangle = new Rectangle(rectangleParameters);
            rectangle.getDetailedInfo();

        }else if (scanFigureName.equals("kwadrat")){
            SquareParameters squareParameters = new SquareParameters();
            squareParameters.scanParameters();
            Square square = new Square(squareParameters);
            square.getDetailedInfo();

        }else if (scanFigureName.equals("trojkat")){
            TriangleParameters triangleParameters = new TriangleParameters();
            triangleParameters.scanParameters();
            Triangle triangle = new Triangle(triangleParameters);
            triangle.countPermiter();
            triangle.getDetailedInfo();

        }else {
            System.out.println("Podano zla wartosc!");
        }

    }
}
