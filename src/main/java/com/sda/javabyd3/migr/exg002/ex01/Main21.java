package com.sda.javabyd3.migr.exg002.ex01;

public class Main21 {
    public static void main(String[] args) {

        ScanNum num = new ScanNum();
        EvenCheck num1 = new EvenCheck();
        boolean result = num1.evenCheck(num.scannNum());

        if(result){
            System.out.println("parzysta");
        }
        else {
            System.out.println("nieparzysta");
        }
    }


}
