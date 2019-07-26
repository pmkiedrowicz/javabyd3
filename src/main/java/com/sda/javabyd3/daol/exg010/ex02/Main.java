package com.sda.javabyd3.daol.exg010.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    List<Point> points = new ArrayList<>();
    points.add(new Point(3,5) );
    points.add(new Point(1,1) );
    points.add(new Point(3,2) );
    points.add(new Point(5,3) );
    points.add(new Point(36,4) );
    points.add(new Point(5,5) );
    points.add(new Point(7,5) );
    points.add(new Point(9,6) );
    points.add(new Point(0,8) );
    points.add(new Point(4,0) );

    points = points.stream().sorted(Comparator.comparing(Point::getX)).collect(Collectors.toList());
    points.forEach(n1 -> System.out.println("x = " + n1.getX() + " y = " + n1.getY() + ";"));

    }


}
