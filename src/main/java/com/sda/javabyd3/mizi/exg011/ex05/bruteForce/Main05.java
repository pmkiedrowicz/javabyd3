package com.sda.javabyd3.mizi.exg011.ex05.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main05 {
    public static void main(String[] args) {
        Point[] twoNearestPoints = new Point[2];
        PointListCreator pointListCreator = new PointListCreator();
        DistansCalculator distansCalculator = new DistansCalculator();
        List<Point> listOfPoint = new ArrayList <>(  );
        Scanner scanner = new Scanner( System.in );

        System.out.println("Podaj ile punktów porównać: ");
        int howMany = scanner.nextInt();
        listOfPoint = pointListCreator.createListOfPoint( howMany );
        //for(Point element: listOfPoint ) System.out.print(" " + element.toString());
        twoNearestPoints = distansCalculator.findTheShortestDistansGreedyMethod( listOfPoint );
        //print to console
        System.out.println("Najblizsze punkty to: ");
        System.out.println("- punkt" + twoNearestPoints[0]);
        System.out.println("- punkt" + twoNearestPoints[1]);
        System.out.printf("Dystans to: %.2f", distansCalculator.calculateDistans( twoNearestPoints[0],
                twoNearestPoints[1]  ) );

    }
}
