package com.sda.javabyd3.toki.exg010.ex02;

import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;

@AllArgsConstructor

public class Point {
    int x;
    int y;

    public Point() {
    }

    public List<Point> showTheList(List<Point> listOfPoints) {
        listOfPoints.stream()
                .sorted(Comparator.comparing(el -> el.x))
                .forEach(el -> System.out.println(el.x+" "+el.y));
        return listOfPoints;
    }
}
