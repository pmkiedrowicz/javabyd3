package com.sda.javabyd3.mizi.exg011.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class FunctionCalculator {
    public void quadraticFunction(int a, int b, int c){
        int resultDelta = delta( a,b,c );
        System.out.println("Delta: " + resultDelta);
        if(resultDelta > 0){
            double x1 = (-b + Math.sqrt( resultDelta ))/(double)(2*a);
            double x2 = (-b - Math.sqrt( resultDelta ))/(double)(2*a);
            System.out.println("Pierwiastki - X1: " + x1 + ", X2: " + x2);
        }
        else if(resultDelta == 0){
            double x = -b/(double)(2*a);
            System.out.println("Pierwiastek - X: " + x );
        }
        else System.out.println(" Brak rozwiazan rzeczywistych. ");
    }

    public int delta(int a, int b, int c){
        int delta = 0;
        delta = b*b - 4*a*c;

        return delta;
    }
}
