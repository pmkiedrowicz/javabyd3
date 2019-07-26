package com.sda.javabyd3.urdu.sorting;

public class BubbleSort {

    public int[] sortedBubble(int[] array){
        boolean end;
        int temp;
        int[] sortedNumber = array;

        do{
            end=true;
            for(int i =0;i<array.length-1;i++){

                if(sortedNumber[i]<=sortedNumber[i+1]){

                } else {
                    temp=sortedNumber[i];
                    sortedNumber[i]=sortedNumber[i+1];
                    sortedNumber[i+1]=temp;
                   end=false;
                }
            }
        }
           while(!end);

        return sortedNumber;
    }

    public void writeArray(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
    }

}
