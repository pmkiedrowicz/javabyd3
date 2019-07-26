package com.sda.javabyd3.kawa.sorty.sortowanieBabelkowe;

public class SortBabelkowy {


    public int[] sortingB(int[] args) {
        for (int i = 0; i < args.length ; i++) {
            for (int j = 0; j < (args.length -1); j++) {
                if (args[j] > args[j + 1]) {
                    int chwilowa = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = chwilowa;
                }
            }
        }return args;
    }

    public void printMySortedList (int[] args2) {
        for (int i = 0; i < args2.length; ++i)
            System.out.print(args2[i] + " ");
    }
}