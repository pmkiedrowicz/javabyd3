package com.sda.javabyd3.kawa.exg001.ogolne.ex03;

public class Main {
    public static void main(String[] args) {

        int liczMiTu = 1;

        LoteryOfNumers myRandomLot = new LoteryOfNumers();
        myRandomLot.loteryOfUnqueNumbs();
        for (int i: myRandomLot.listOfNumbs){
            System.out.println("Liczba nr " + liczMiTu + " to - " + i);
            liczMiTu++;
        }

    }
}
