package com.sda.javabyd3.urdu.exg001.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main17 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Urszula", "Nowak", 3000));
        employees.add(new Employee("Marta", "Dutkiewicz", 1000));
        employees.add(new Employee("Adam", "Kowalski", 4000));
        employees.add(new Employee("Michał", "Domek", 1500));
        employees.add(new Employee("Grześ", "Król", 6000));
        employees.add(new Employee("Artur", "Foch", 1000));
        employees.add(new Employee("Sebastian", "Wilk", 2700));
        employees.add(new Employee("Ania", "Maj", 8000));
        employees.add(new Employee("Jagoda", "Mróz", 4700));
        employees.add(new Employee("Paweł", "Mika", 2000));

        Double everage = employees.stream().collect(Collectors.averagingInt(s -> s.salary));
        System.out.println("średnia zarobków to: " + everage);
        System.out.println("Pracownicy którzy zarabiają powyżej średniej: ");
        employees.stream().filter(sol -> sol.salary > everage).forEach(s -> System.out.println(s.name + " " + s.lastName + " " + s.salary));
    }
}
