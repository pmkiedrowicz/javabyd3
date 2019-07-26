package com.sda.javabyd3.toki.exg002array.ex07;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 8, 9, 22, 23, 32, 33};
        SumPairNumbers sumPairNumbers = new SumPairNumbers();
        SumUnpairNumbers sumUnpairNumbers = new SumUnpairNumbers();
        int sumPair=sumPairNumbers.sumPairNumbers(numbers);
        int sumUnpair=sumUnpairNumbers.sumUnpairNumbers(numbers);



        if ( sumPair>sumUnpair ){
            System.out.println("Sum on pair array positions are higher  "+sumPair+":"+sumUnpair);
        }else {
            System.out.println("Sum on unpair array positions are higher  "+sumUnpair+":"+sumPair);

        }


    }
}
