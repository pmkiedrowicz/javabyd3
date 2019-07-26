package com.sda.javabyd3.mizi.exg011.ex05.bruteForce;


import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class DistansCalculator {

    //Greedy method
    public Point[] findTheShortestDistansGreedyMethod(List<Point> listOfPoints){
        Point[] twoNearestPoints = new Point[2];
        int sizeOfList = listOfPoints.size();
        // create basic distance beetwen two points
        Double shortestDistance = calculateDistans( listOfPoints.get( 0 ),listOfPoints.get( 1 ) );
        twoNearestPoints[0] = listOfPoints.get( 0 );
        twoNearestPoints[1] = listOfPoints.get( 1 );
        // look for shortest distans
        for(int i = 1; i < sizeOfList; i++ ){
            for(int j = 0; j < sizeOfList; j++){
                Double newDistance;
                if(i != j){
                    newDistance = calculateDistans( listOfPoints.get( i ), listOfPoints.get( j ) );
                    if(shortestDistance > newDistance){
                        shortestDistance = newDistance;
                        twoNearestPoints[0] = listOfPoints.get( i );
                        twoNearestPoints[1] = listOfPoints.get( j );
                    }
                }

            }
        }

        return  twoNearestPoints;
    }

    // divide and conquer method
    public Point[] findTheShortestDistansQuickMethod(List<Point> listOfPoints){
        Point[] twoNearestPoints = new Point[2];
        int sizeOfList = listOfPoints.size();
        // create basic distance beetwen two points
        Double shortestDistance = calculateDistans( listOfPoints.get( 0 ),listOfPoints.get( 1 ) );
        twoNearestPoints[0] = listOfPoints.get( 0 );
        twoNearestPoints[1] = listOfPoints.get( 1 );
        // look for shortest distans
        //--place to finishing code

        return  twoNearestPoints;
    }

    public Double calculateDistans(Point point1, Point point2){
        Integer distanceOnXAxis = point2.getPosX() - point1.getPosX();
        Integer distanceOnYAxis = point2.getPosY() - point1.getPosY();
        Double distance = Math.sqrt( distanceOnXAxis * distanceOnXAxis + distanceOnYAxis * distanceOnYAxis );
        distance = Math.abs( distance );
        return distance;
    }


}
