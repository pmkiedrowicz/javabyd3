package Zad002;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Michal Ziolecki.
 */
public class Zad3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int key = 7;
        System.out.println("Zawartosc? " + contains(array, key));
    }

    public static boolean contains(int[] array, int key)
    {
        boolean test = false;
        for(int i= 0; i < array.length; i++ )
        {
            if(array[i] == key) test = true;
        }
        return test;
    }

}
