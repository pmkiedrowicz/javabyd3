package com.sda.javabyd3.urdu.recursion014.ex02;

public class SumWithRecuAndLoop {

    public int sumRecursion(int number){

        if(number>0){
            return number + sumRecursion(number-1);
        }
        return 0;
    }

    public int sumWithLoop(int number){
        int sum=0;

        for (int i = 0; i <=number ; i++) {
        sum+=i;
        }
        return  sum;
    }
}
