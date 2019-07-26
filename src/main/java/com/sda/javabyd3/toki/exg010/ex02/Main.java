package com.sda.javabyd3.toki.exg010.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point point = new Point();
        List<Point> listOfPoints = new ArrayList<>();
        listOfPoints.add(new Point(55, 66));
        listOfPoints.add(new Point(44, 67));
        listOfPoints.add(new Point(33, 68));
        listOfPoints.add(new Point(22, 69));
        listOfPoints.add(new Point(11, 60));
        listOfPoints.add(new Point(77, 61));
        listOfPoints.add(new Point(88, 62));
        listOfPoints.add(new Point(99, 63));
        listOfPoints.add(new Point(101, 64));
        listOfPoints.add(new Point(67, 65));

        point.showTheList(listOfPoints);
    }
}
