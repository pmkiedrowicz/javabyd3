//Przygotuj algorytm rozwiązujący każde zadanie w osobnej klasie (zgodnie z metodyką
//S.O.L.I.D) i wywołaj odpowiednią metodę z tej klasy z metody main w celu prezentacji jego
//działania. Napisz testy jednostkowe weryfikujące działanie klasy.
//Przygotuj aplikację obliczającą pierwiastki równania kwadratowego ax2+bx+c=0.
//Dane wejściowe: parametry a,b,c. Dane wyjściowe x1 i x2

package com.sda.javabyd3.wowa.exg011.ex01;

import java.util.Scanner;

public class QuadraticEquationRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for solving quadratic equation ax2 + bx + c = 0");

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        if (0 == a) {
            System.out.println("It is not quadratic equation, try again");
            System.exit(666);
        }
        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        System.out.println("Delta: " + qe.getDelta());

        if (0 > qe.getDelta()) {
            System.out.println("No real numbers solution");
        } else if (0 == qe.getDelta()) {
            System.out.println("One real number solution: " + qe.getAnswer1());
        } else {
            System.out.println("Two real numbers solution: " + qe.getAnswer1() + " and " + qe.getAnswer2());
        }
        sc.close();
    }
}
