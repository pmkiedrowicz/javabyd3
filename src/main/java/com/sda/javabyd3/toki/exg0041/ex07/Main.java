package com.sda.javabyd3.toki.exg0041.ex07;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180, 8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104, 6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182, 192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};
        JustForInputInt justForInputInt = new JustForInputInt();
        justForInputInt.sqrtThisTable(numbers);

        double[] doubles = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubles[i] = numbers[i];
        }

        SqrtThisTable sqrtThisTable = new SqrtThisTable();
        sqrtThisTable.sqrtThis(doubles);
    }
}
