package com.sda.javabyd3.kawa.exg004.StreamAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180, 8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4,
                104, 6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182, 192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        ArrayList<Integer> myArrayList = Arrays.stream(numbers).boxed().collect(Collectors.toCollection(ArrayList::new));

        AllExFrom01To07 myOperations = new AllExFrom01To07();

        System.out.println("orginal tab of numbs ->" + Arrays.toString(numbers));
        System.out.println("-- Ex01 --");
        System.out.println("max -> " + myOperations.streamingMax(myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex02 --");
        System.out.println("min -> " + myOperations.streamingMin(myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex03 --");
        System.out.println("average -> " + myOperations.streamingAvg(myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex04 --");
        System.out.println("sum -> " + myOperations.streamingSum(myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex05 --");
        System.out.println("quantity of numbers greater than average -> " + myOperations
                .streamingQuantOfNumbsGreaterThanAvg(myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex06 --");
        System.out.println("average value of 5 numbers greater than average value of tab -> " + myOperations
                .steamingAvgOf5NumbsGreaterThanAverageOfAllNumbs
                (myArrayList));
        System.out.println("----------");
        System.out.println("-- Ex07 --");
        System.out.println("all pow -> ");
        for(double item : myOperations.streamingSqrtOfAllNumbs(myArrayList)) {
            System.out.print(String.format("%.2f", item) + " , ");
        }
        System.out.println(" ");
        System.out.println("----------");


    }

}
