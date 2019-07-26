package com.sda.javabyd3.urdu.exg001.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main16 {

    public static void main(String[] args) {

       Integer numbers [] = {1,7,20,14,66,30};
       List<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbers));

        System.out.println("Najmniejsza liczba na liście to: "+ numbersList.stream().min((num1, num2) -> num1.compareTo(num2)).get());

        System.out.println("Największa liczba na liście to: "+ numbersList.stream().max((num1, num2) -> num1.compareTo(num2)).get());
    }

}
