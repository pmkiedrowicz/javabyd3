package com.sda.javabyd3.kade.exg010.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Point> listOfPoints = new ArrayList<>();

        Point point1 = new Point(2, 7);
        listOfPoints.add(point1);

        Point point2 = new Point(9, 9);
        listOfPoints.add(point2);

        Point point3 = new Point(6, 5);
        listOfPoints.add(point3);

        Point point4 = new Point(23, 1);
        listOfPoints.add(point4);

        Point point5 = new Point(18, 99);
        listOfPoints.add(point5);

        Point point6 = new Point(45, 6);
        listOfPoints.add(point6);

        Point point7 = new Point(23, 1);
        listOfPoints.add(point7);

        Point point8 = new Point(87, 31);
        listOfPoints.add(point8);

        Point point9 = new Point(13, 72);
        listOfPoints.add(point9);

        Point point10 = new Point(22, 65);
        listOfPoints.add(point10);

        //Arrays.stream(listOfPoints).filter(item -> item > System.out.println(item));

        //listOfPoints.stream().forEach(item -> System.out.println(item.toString()));
        listOfPoints.stream().sorted((item1, item2) -> Integer.compare(item1.getX(), item2.getX()))
                .forEach(item -> System.out.println(item.toString()));


    }
}
