package Zad002;

import java.util.Arrays;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(printArray( array ));
    }
    public static String printArray (int[] array)
    {
        return Arrays.toString(array);
    }
}
