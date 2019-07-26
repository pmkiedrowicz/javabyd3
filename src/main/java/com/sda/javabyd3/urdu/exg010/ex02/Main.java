package com.sda.javabyd3.urdu.exg010.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Point> listOfPoints = new ArrayList<>();

        listOfPoints.add( new Point(2,5));
        listOfPoints.add( new Point(7,11));
        listOfPoints.add( new Point(3,9));
        listOfPoints.add( new Point(55,95));
        listOfPoints.add( new Point(1,5));
        listOfPoints.add( new Point(5,6));
        listOfPoints.add( new Point(8,8));
        listOfPoints.add( new Point(13,54));
        listOfPoints.add( new Point(61,3));
        listOfPoints.add( new Point(31,73));

        listOfPoints.stream().sorted(Comparator.comparingInt(Point::getX)).forEach(point -> System.out.println(point.toString()));

       // listOfPoints.stream().sorted((x1, x2) -> Integer.compare(x1.getX(),x2.getX())).forEach(point -> System.out.println(point.toString()));
    }
}
