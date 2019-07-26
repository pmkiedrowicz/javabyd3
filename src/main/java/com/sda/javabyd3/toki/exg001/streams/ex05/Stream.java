package com.sda.javabyd3.toki.exg001.streams.ex05;

import lombok.AllArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor

public class Stream {
    public double average(List<Worker> workerList) {
        Double average = workerList.stream()
                .collect(Collectors.averagingDouble(el -> el.salary));
        return average;
    }

    public List<Worker> moreThanAverage(List<Worker> workerList) {
        double average = average(workerList);
        workerList.stream()
                .filter(el -> el.salary > average)
                .forEach(el -> System.out.println("Worker who gets more than average salary: " + el.getName() + " " + el.getSurname() + " " + el.getSalary()));
        return workerList;
    }
}
