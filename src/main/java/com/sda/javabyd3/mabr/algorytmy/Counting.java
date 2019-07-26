package com.sda.javabyd3.mabr.algorytmy;

public class Counting {

    int[] countingSort(int arr[] )
    {
        int n = arr.length;

        // The result will store sorted array
        int result[] = new int[n];
        int max = arr[0];

        for (int k=0; k<arr.length; k++ ){
            if (arr [k] > max){
                max = arr [k];
            }
        }

        // Initialize count array with 9 as array contains elements from range 1 to max.
        int count[] = new int[max+1];
        for (int i=0; i<max+1; ++i)
            count[i] = 0;

        // store count of each element in count array
        for (int i=0; i<n; ++i)
            ++count[arr[i]];

        // Change count[i] so that count[i] now contains actual
        // position of this element in output array
        for (int i=1; i<max+1; ++i)
            count[i] += count[i-1];

        for (int i = 0; i<n; ++i)
        {
            result[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        return result;
    }
    }



