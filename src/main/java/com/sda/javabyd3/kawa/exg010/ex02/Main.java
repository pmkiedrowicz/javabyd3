package com.sda.javabyd3.kawa.exg010.ex02;

import com.sda.javabyd3.lusi.exg009.ex03.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Point> pointsList = new ArrayList<Point>() {{
            add(new Point(4, 5));
            add(new Point(7, 2));
            add(new Point(23, 11));
            add(new Point(42, 10));
            add(new Point(1, 75));
            add(new Point(8, 32));
            add(new Point(5, 4));
            add(new Point(2, 2));
            add(new Point(9, 0));
            add(new Point(0, 3));
        }};

        pointsList.stream().sorted(Comparator.comparing(e -> e.getX())).forEach(e -> System.out.println("(" + e.getX()
                + " , " + e.getY() + ") "));
    }
}
