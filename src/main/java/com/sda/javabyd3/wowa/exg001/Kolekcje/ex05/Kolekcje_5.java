//Jesteś osobą przetwarzająca zadania w kolejności w jakiej do Ciebie przyszły
//(kolejka FIFO). Wykorzystaj do tego odpowiednią kolekcję. Dodaj 10 zadań, a
//następnie pobierz je z kolekcji w takiej kolejności w jakiej zostały do niej dodane.

package com.sda.javabyd3.wowa.exg001.Kolekcje.ex05;

import java.util.ArrayDeque;
import java.util.Queue;

public class Kolekcje_5 {
    public static void main(String[] args) {

        Queue<String> tasks = new ArrayDeque<>();
        String task = "task";

        for (int i = 0; i < 10; i++) {
            tasks.add(task + (i + 1));
        }

        System.out.println("Amount of tasks to solve: " + tasks.size());
        System.out.println("Added tasks: " + tasks);

        for (String i : tasks) {
            tasks.remove(i);
            System.out.println("solved " + i);
            System.out.println("Tasks left: " + tasks);
        }
        
        System.out.println("tasks.size(): " + tasks.size());
    }
}
