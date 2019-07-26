package com.sda.javabyd3.migr.exg001.ex03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

    public static void main(String[] args) {


    Random r = new Random();
    Set<Integer> uniqueNumbers = new HashSet<>();
    while (uniqueNumbers.size()<20){
        uniqueNumbers.add(r.nextInt(100));
    }
    for (Integer i : uniqueNumbers){
        System.out.print(i+" ");
    }
}}
