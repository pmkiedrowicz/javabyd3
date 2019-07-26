package com.sda.javabyd3.daol.exg001.ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employe> employeList = new ArrayList<>();
        employeList.add(new Employe("Daniel", "Olszewski", 5000));
        employeList.add(new Employe("Mateusz", "Maras", 1500));
        employeList.add(new Employe("Radek", "Drwecki", 3000));
        employeList.add(new Employe("Marta", "Zuch", 3400));
        employeList.add(new Employe("Sonia", "Trabant", 1200));
        employeList.add(new Employe("Trelek", "Olszewski", 11000));
        employeList.add(new Employe("Przemo", "Jakimczuk", 6500));
        employeList.add(new Employe("Lukasz", "Osmo", 3240));
        employeList.add(new Employe("Sven", "Hannavald", 1750));
        employeList.add(new Employe("Mirek", "Kut", 800));

        Double averageSalary = employeList.stream()
                .collect(Collectors.averagingInt(s -> s.salary));
        System.out.println("Average Salary: " + averageSalary);

        List<Employe> aboveAverage = employeList.stream()
                .filter(s -> s.salary > averageSalary)
                .collect(Collectors.toList());
        System.out.println("> above average salary: ");
        aboveAverage.forEach(s -> System.out.println(s.name + " " + s.surname + ": " + s.salary));
    }
}
