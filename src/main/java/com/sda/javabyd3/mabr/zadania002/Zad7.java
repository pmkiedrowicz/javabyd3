package com.sda.javabyd3.mabr.zadania002;

public class Zad7 {
    public String checkSumInTable(int[] array) {
        Integer sumOnPosMod2 = 0;
        Integer sumOnPosNotMod2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) sumOnPosMod2 += array[i];
            else sumOnPosNotMod2 += array[i];
        }

        System.out.println("Sum of odd: " + sumOnPosMod2);
        System.out.println("Sum of even: " + sumOnPosNotMod2);
        String info;
        if (sumOnPosMod2 < sumOnPosNotMod2) return info = "Evens are greater";
        else return info = "Odds are greater";
    }
}
