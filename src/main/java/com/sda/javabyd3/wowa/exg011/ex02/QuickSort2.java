//Przygotuj program sortujący tablicę metodą QuickSort
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana
//pivot na koncu

package com.sda.javabyd3.wowa.exg011.ex02;

public class QuickSort2 {
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * The main function that implements QuickSort()
     *
     * @param arr  Array to be sorted
     * @param low  Starting index
     * @param high Ending index
     */
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }
}
