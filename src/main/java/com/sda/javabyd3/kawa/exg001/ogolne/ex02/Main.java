package com.sda.javabyd3.kawa.exg001.ogolne.ex02;


public class Main {
    public static void main(String[] args) {

        boolean stopWhenEmptyArrayList = false;

        do {

            ScanSomeNumbers letsStart = new ScanSomeNumbers();
            letsStart.scan();

            if (letsStart.listaLiczb.size()<1) {
                System.out.println("Nie podano zadnych wartosci liczbowych");
                stopWhenEmptyArrayList = true;
            }else {
                HighestLowestNumbAndSum calculating = new HighestLowestNumbAndSum();
                calculating.calculateHighest(letsStart.listaLiczb);
                calculating.calculateLowest(letsStart.listaLiczb);
                calculating.sumAllNumbs(letsStart.listaLiczb);
            }
        }while (!stopWhenEmptyArrayList);

    }
}
