package com.sda.javabyd3.mizi.exg011.ex05.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class PointListCreator {
    public List<Point> createListOfPoint(int howMany){
        Point point;
        List<Point> listOfPoint = new ArrayList<>(  );
        Random random = new Random(  );

        for(int i = 1; i <= howMany; i++){
            System.out.println("Wprowadzam teraz punkt nr. " + i);
            point = new Point( i );
            int x = random.nextInt(100)+1;
            System.out.println(" Losuje pozycje X: " + x);
            point.setPosX( x );
            int y = random.nextInt(100)+1;
            System.out.println(" Losuje pozycje Y: " + y);
            point.setPosY( y );
            listOfPoint.add( point );
        }

        return listOfPoint;
    }
}
