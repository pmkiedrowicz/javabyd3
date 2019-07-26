package com.sda.javabyd3.urdu.exg001.ex01;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        numbers.add(scanNumber.nextInt());

        System.out.println("Podaj drugą liczbę: ");
        numbers.add(scanNumber.nextInt());

        System.out.println("Podaj trzecią liczbę: ");
        numbers.add(scanNumber.nextInt());

        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);

        }
        System.out.println("Suma liczb równa się: " + sum);

        Optional<Integer> max = numbers.stream().max((num1, num2) -> num1.compareTo(num2));
        int suma = numbers.stream().mapToInt(num1 -> num1).sum();  // inny sposób na sumę

        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

        int maxC = Collections.max(numbers);

        System.out.println("Największa liczba to: " + max.get());
        System.out.println("Najmniejsza liczba to: " + min.get());

        System.out.println("Największa sposobem collections " + maxC);

    }


}
