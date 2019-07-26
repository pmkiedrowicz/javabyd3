package Zad002;

import java.util.Arrays;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 {
    public static void main(String[] args) {

        int[] arrayX = {1,2,3,4,5,6};
        System.out.println("Kopia tablicy: " + Arrays.toString( copyArray( arrayX ) ));
    }

    public static int[] copyArray(int[] array)
    {
        int[] copyOfArray = array;
        return copyOfArray;
    }
}
