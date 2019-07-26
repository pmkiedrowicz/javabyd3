package com.sda.javabyd3.toki.exg007oop.ex03;

public class Adds {
    public Adds() {
    }

    public Integer summedNumbers(int arg0, int... args) {

        Integer sum = arg0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }

}
