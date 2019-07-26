//Utwórz klasę pracownik posiadającą imię, nazwisko i wynagrodzenie. Dodaj 10
//pracowników do kolekcji ArrayList. Korzystając ze strumieni znajdź średnie
//wynagrodzenie pracownika, a następnie korzystając ze strumieni wyświetl wszystkich
//pracowników zarabiających więcej niż średnia.

package com.sda.javabyd3.wowa.exg001.Streamy.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_5_EmployeeRun {
    public static void main(String[] args) {

        List<Stream_5_Employee> employeeList = new ArrayList<>();

        employeeList.add(new Stream_5_Employee("Marek", "M", 6400));
        employeeList.add(new Stream_5_Employee("Ania", "A", 3400));
        employeeList.add(new Stream_5_Employee("Wojtek", "W", 20000));
        employeeList.add(new Stream_5_Employee("Tomek", "T", 5000));
        employeeList.add(new Stream_5_Employee("Magda", "M", 4000));
        employeeList.add(new Stream_5_Employee("Jan", "J", 4500));
        employeeList.add(new Stream_5_Employee("Franek", "F", 7600));
        employeeList.add(new Stream_5_Employee("Arek", "A", 2200));
        employeeList.add(new Stream_5_Employee("Karolina", "K", 9060));
        employeeList.add(new Stream_5_Employee("Zenon", "Z", 2000));

        Double avgSalary = employeeList.stream()
                .collect(Collectors.averagingInt(s -> s.salary));
        System.out.println("Average salary: " + avgSalary);

        List<Stream_5_Employee> richList = employeeList.stream()
                .filter(s -> s.salary > avgSalary)
                .collect(Collectors.toList());
        System.out.print("> average salary: ");
        richList.forEach(s -> System.out.print(s.name + " " + s.surname + "(" + s.salary + ") "));
    }
}
