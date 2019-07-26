package com.sda.javabyd3.kawa.exg001.streamy.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList();

        employeeList.add(new Employee("Maciej", "A", 2500));
        employeeList.add(new Employee("Michal", "E", 3000));
        employeeList.add(new Employee("Tomasz", "F", 2400));
        employeeList.add(new Employee("Kasia", "D", 3300));
        employeeList.add(new Employee("Basia", "F", 12000));
        employeeList.add(new Employee("Patryk", "H", 9900));
        employeeList.add(new Employee("Marek", "F", 2355));
        employeeList.add(new Employee("Mirek", "E", 6543));
        employeeList.add(new Employee("Kasia", "C", 3550));
        employeeList.add(new Employee("Ola", "D", 2900));

        Double calcAvg = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Srednia zarobkow wynosi: " + calcAvg);

        employeeList.stream().filter(e -> e.getSalary() > calcAvg)
                .collect(Collectors.toList())
                .forEach(e -> System.out.println("Powyzej sredniej zarobkow miesci sie -> " +
                        e.getName() + " " + e.getSurname()));

    }
}
