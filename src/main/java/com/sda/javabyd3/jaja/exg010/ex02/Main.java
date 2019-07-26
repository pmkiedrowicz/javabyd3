package com.sda.javabyd3.jaja.exg010.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Point> point = new ArrayList<>();
        point.add(new Point(2, 5));
        point.add(new Point(1, 7));
        point.add(new Point(10, 17));
        point.add(new Point(21, 37));
        point.add(new Point(59, 75));
        point.add(new Point(101, 72));
        point.add(new Point(11, 65));
        point.add(new Point(112, 8));
        point.add(new Point(91, 57));
        point.add(new Point(3, 5));

        point = point.stream().sorted(Comparator.comparing(Point::getX)).collect(Collectors.toList());
        point.forEach(n1 -> System.out.println("x = " + n1.getX() + ";" + " y = " + n1.getY() + ";"));

    }
}
