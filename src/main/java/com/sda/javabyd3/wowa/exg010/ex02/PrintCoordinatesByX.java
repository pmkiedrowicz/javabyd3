//Utwórz klasę Point zawierającą zmienne int x oraz int y. Dodaj 10 punktów do listy
//List<Point>. Korzystając ze strumieni posortuj punkty według współrzędnej x i
//wyświetl posortowaną tablicę.

package com.sda.javabyd3.wowa.exg010.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintCoordinatesByX {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(32, 32));
        points.add(new Point(45, 2));
        points.add(new Point(11, 66));
        points.add(new Point(3, 86));
        points.add(new Point(35, 6));
        points.add(new Point(32, 54));
        points.add(new Point(21, 87));
        points.add(new Point(12, 66));
        points.add(new Point(35, 69));
        points.add(new Point(42, 45));

        points.stream()
                .sorted(Comparator.comparing(p1 -> p1.x))
                .forEach(p -> System.out.print(p.x + " "));
    }
}
