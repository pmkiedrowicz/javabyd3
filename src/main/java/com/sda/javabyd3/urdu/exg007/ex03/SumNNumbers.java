package com.sda.javabyd3.urdu.exg007.ex03;

public class SumNNumbers {

        public Integer sumNumbers(int arg0, int ...args){
            Integer sum=arg0;

            for(int i=0;i< args.length;i++){
                sum+=args[i];
            }

            return sum;
        }
}
