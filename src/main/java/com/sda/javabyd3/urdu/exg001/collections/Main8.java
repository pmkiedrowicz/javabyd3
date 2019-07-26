package com.sda.javabyd3.urdu.exg001.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main8 {

    public static void main(String[] args) {

        List<Integer> listOfnumbers = new ArrayList<>();
        Random r = new Random();

        for(int i =0;i<10;i++){
            listOfnumbers.add(r.nextInt(100)+1);
            System.out.print(listOfnumbers.get(i)+ " ");
        }

    }

}
