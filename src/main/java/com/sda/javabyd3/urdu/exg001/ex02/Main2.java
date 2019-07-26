package com.sda.javabyd3.urdu.exg001.ex02;

import java.util.*;


public class Main2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        boolean end = false;
        int control;
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Podaj liczby. 0 kończy wprowadzanie");

        while (!end) {
            System.out.println("Podaj liczbę: ");
            control = scanNumber.nextInt();

            if (control == 0) {
                end = true;
                System.out.println("koniec ");
            } else {
                numbers.add(control);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);
        }

        System.out.println("Suma liczb równa się: " + sum);

        Optional<Integer> max = numbers.stream().max((num1, num2) -> num1.compareTo(num2));

        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

        int maxC = Collections.max(numbers); //inny sposób

        System.out.println("Największa liczba to: " + max.get());
        System.out.println("Najmniejsza liczba to: " + min.get());
        System.out.println("Największa z collections " + maxC);

    }


}
