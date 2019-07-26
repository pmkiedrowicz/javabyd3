package Zad002;

import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Zad6 {
    public static void main(String[] args) {
        int[] arrayX = {1,2,3,4,5,6};
        reverse( arrayX );
    }

    public static void reverse (int [] array)
    {
        int[] reverseArray = new int[array.length];
        //ReverseArray = Arrays.stream(array).toArray();
        int j = array.length - 1;
        //odwrocona tablica z lapy
        for(int i = 0;  i < array.length; i++)
        {
            reverseArray[i] = array[j];
            j--;
        }
        System.out.println("Odwrocona tablica lopatologicznie: " + Arrays.toString( reverseArray ));

        List<int[]> listOfElements = Arrays.asList( array );


    }
}
