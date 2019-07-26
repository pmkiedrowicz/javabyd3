package com.sda.javabyd3.kawa.exg001.ogolne.ex03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LoteryOfNumers {

    Set<Integer> listOfNumbs = new HashSet<>();
    private Random randomGen = new Random();

    public void loteryOfUnqueNumbs (){
        while (listOfNumbs.size()<20){
            listOfNumbs.add(randomGen.nextInt(100));
        }
    }
}
