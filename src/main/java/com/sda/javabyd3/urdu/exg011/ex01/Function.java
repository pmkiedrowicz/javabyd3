package com.sda.javabyd3.urdu.exg011.ex01;

public class Function {

    public String equationSolution(double a, double b, double c){
       double delta = getDelta(a,b,c);
         if(delta<0){
             return "Brak rozwiązań rzeczywistych.";

         } else if(delta==0){
             double x = -b/(2*a);
            return "Pierwiastek X = " + x;

         }else {
             double x1 = (-b + Math.sqrt( delta ))/(2*a);
             double x2 = (-b - Math.sqrt( delta ))/(2*a);
             return "Pierwiastki X1= " + x1 + ", X2: " + x2;

         }
    }

    public double getDelta(double a,double b, double c){
        double delta =0;
        delta = b*b - 4*a*c;

        return  delta;
    }



}
