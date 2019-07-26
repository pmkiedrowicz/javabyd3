package com.sda.javabyd3.urdu.exg001.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main11 {

    public static void main(String[] args) {

        Queue<String> tasks = new ArrayDeque<>();

        tasks.add("Wczytać plik");
        tasks.add("Zmodyfikować dane");
        tasks.add("Sprawdzić błędy");
        tasks.add("Wysłac do weryfikacji");
        tasks.add("Zapoznać się z sugestiami");
        tasks.add("Wprowadzić poprawki");
        tasks.add("Ponowna weryfikacja");
        tasks.add("Zapis do pliku");
        tasks.add("Wysłać do klienta");
        tasks.add("Odebrać zapłatę i modlić się , żeby nic się nie posypało");

        int size = tasks.size();

        for (int i = 0; i < size; i++){

            System.out.println(tasks.poll());
        }


    }
}
