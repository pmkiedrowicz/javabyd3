package com.sda.javabyd3.kawa.myKawaEnum.enum0;

public class Main2 {
    public static void main(String[] args) {
        CountryDirectionalNumber cdn = CountryDirectionalNumber.Australia;
        System.out.println(cdn.getDirectional());
        System.out.println(cdn);
        System.out.println(cdn.getCurrency());
        CountryDirectionalNumber cdn2 = CountryDirectionalNumber.Niemcy;
        System.out.println(cdn2 + " , " + cdn2.getDirectional()+" , " + cdn2.getCurrency());
        CountryDirectionalNumber cdn3 = CountryDirectionalNumber.Polska;
        System.out.println(cdn3 + " , " + cdn3.getDirectional()+ " , " + cdn3.getCurrency());
    }
}
