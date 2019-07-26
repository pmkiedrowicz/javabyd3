package com.sda.javabyd3.mizi.exg010.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main02Lambda {
    public static void main(String[] args) {

        List<Point> litOfPoints = new ArrayList <>(  );

        Point point1 = new Point( 6,8 );
        litOfPoints.add( point1 );
        Point point2 = new Point( 2,4 );
        litOfPoints.add( point2 );
        Point point3 = new Point( 0,0 );
        litOfPoints.add( point3 );
        Point point4 = new Point( 10,5 );
        litOfPoints.add( point4 );
        Point point5 = new Point( 4,6 );
        litOfPoints.add( point5 );

        litOfPoints.stream().forEach( item -> System.out.println(item.toString()) );
        System.out.println("-----------------------");
        litOfPoints.stream().sorted( (item1,item2) -> Integer.compare( item1.getX(), item2.getX() ) )
                .forEach( item -> System.out.println(item.toString()) );
    }
}
