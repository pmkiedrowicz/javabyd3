package com.sda.javabyd3.daol.exg003.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        System.out.println(primeChecker.primeNumbers(number)? "Liczba " + number + " jest liczbą pierwszą." : "Liczba " + number + " nie jest liczbą pierwszą.");
    }
}
//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
//        System.out.println("Podaj liczbe ");
//        Integer number = scanner.nextInt();
//        boolean status = test(number);
//        if(status) System.out.println("Liczba jest pierwsza");
//        else System.out.println("Liczba nie jest pierwsza");
//    }
//    public static boolean test(int number)
//    {
//        if( number < 2) return false;
//        for( int i = 2 ; i < number ; i ++)
//        {
//            if( number % i == 0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//}
