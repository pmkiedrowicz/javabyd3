package com.sda.javabyd3.syga.exg010.ex02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Point> listOfPoints = new ArrayList<Point>();
        listOfPoints.add(new Point(3,65));
        listOfPoints.add(new Point(4,33));
        listOfPoints.add(new Point(5,23));
        listOfPoints.add(new Point(55,4));
        listOfPoints.add(new Point(7,9));
        listOfPoints.add(new Point(23,11));
        listOfPoints.add(new Point(9,5));
        listOfPoints.add(new Point(123,1));
        listOfPoints.add(new Point(3,6));
        listOfPoints.add(new Point(12,12));

       // listOfPoints.stream().map(Point::getX).sorted().forEach(n -> System.out.println(n));
        listOfPoints.stream().sorted().forEach(n -> System.out.println(n));

    }
}
