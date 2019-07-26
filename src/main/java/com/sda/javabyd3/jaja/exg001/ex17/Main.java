package com.sda.javabyd3.jaja.exg001.ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Zadanie17> worker = new ArrayList<>();
        worker.add(new Zadanie17("Jagoda", "Jag", 5500));
        worker.add(new Zadanie17("Magdalena", "Mag", 2500));
        worker.add(new Zadanie17("Adam", "Ada", 3500));
        worker.add(new Zadanie17("Jolanta", "Jol", 4500));
        worker.add(new Zadanie17("Mariola", "Mar", 2500));
        worker.add(new Zadanie17("Monika", "Mon", 2300));
        worker.add(new Zadanie17("Aleksander", "Ale", 2700));
        worker.add(new Zadanie17("Mateusz", "Mat", 2500));
        worker.add(new Zadanie17("Kamil", "Kam", 2900));
        worker.add(new Zadanie17("Agnieszka", "Agn", 3800));


        Double averageSalary = worker.stream()
                .collect(Collectors.averagingInt(n -> n.salary));
        System.out.println("Srednia zarobek w firmie: " + averageSalary);

        worker.stream()
                .filter(n -> n.salary > averageSalary)
                .forEach(n -> System.out.println(
                        "Pracownik zarabiający powyżej średniej: "
                                + n.name + " "
                                + n.surename + " "
                                + "otrzymuje wynagrodznie w wysokości = " + n.salary));

    }
}
