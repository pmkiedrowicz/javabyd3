package com.sda.javabyd3.urdu.exg002.arrays;

public class Main7 {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 6, 9, 3, 20, 13, 4, 2, 5};
        int[] numbers2={1,2,3,4,5,6,7};

        MethodSum met = new MethodSum();

        System.out.println("Suma liczb o indeksach parzystych równa się: " +met.sumIndexP(numbers));
        System.out.println("Suma liczb o indeksach nieparzystych równa się: " +met.sumIndexNonP(numbers));

        System.out.println( met.whichSumBigger(numbers));
        System.out.println("W drugiej tablicy: ");
        System.out.println(met.whichSumBigger(numbers2));

    }

}
