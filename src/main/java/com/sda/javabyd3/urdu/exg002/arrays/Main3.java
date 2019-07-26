package com.sda.javabyd3.urdu.exg002.arrays;

public class Main3 {

    public static void main(String[] args) {

        int numbers[] = {1,2,4,5,6,7};

       boolean itIsOrItIsnt = contains(numbers,6);

       if(itIsOrItIsnt == true){
           System.out.println("Szukana liczba znajduje się w tablicy");
       } else
           {
               System.out.println("Szykanej liczb nie ma w tablicy");
           }

    }


    public static boolean contains(int[] array, int key) {
        boolean is = false;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == key) {
                is = true;
            }
        }
        return is;
    }


}
