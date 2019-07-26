package com.sda.javabyd3.urdu.exg002.arrays;

public class MethodSum {

    public int sumIndexP(int[] array){
        int sum=0;

        for(int i=0;i<array.length;i++){

            if(i%2==0){
                sum+=array[i];
            }
        }
        return  sum;
    }


    public int sumIndexNonP(int[] array){
        int sum=0;

        for(int i=0;i<array.length;i++){

            if(i%2==1){
                sum+=array[i];
            }
        }
        return  sum;
    }

    public String whichSumBigger(int[] array){
        MethodSum met = new MethodSum();
        int parity = met.sumIndexP(array);
        int nonParity =met.sumIndexNonP(array);

            if(parity>nonParity){
                return "Większa jest suma o indeksach parzystych";
            }
            else return "Większa jest suma o indeksach nieparzystych";
    }
}
