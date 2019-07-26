package Zad002;

import java.util.Arrays;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4 {
    public static void main(String[] args) {
        int[] arrayX = {1,2,3,4,5,6};
        int[] arrayY = {1,2,3,4,5,6};

        System.out.println("Porownanie dwoch tabel: " + equals( arrayX, arrayY ));
    }

    public static boolean equals(int[] array1, int[] array2)
    {
        boolean test = false;
        test = Arrays.equals(array1,array2);

        return test;
    }
}
