package com.sda.javabyd3.toki.exg0041.ex07;

public class SqrtThisTable {
    public SqrtThisTable() {
    }

    public double[] sqrtThis(double[] doubles) {

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.sqrt(doubles[i]);
            doubles[i]=doubles[i]*100;
            doubles[i]=Math.round(doubles[i]);
            doubles[i]=doubles[i]/100;
        }

        return doubles;
    }
}
