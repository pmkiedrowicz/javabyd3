//Przygotuj program pobierający liczby od użytkownika. Liczby powinna pobierać
//odpowiednia klasa. Klasa powinna zawierać metodę getNumbersFromUser i powinna
//mieć następującą sygnaturę List<Integer> getNumbersFromUser(). Liczby powinna
//pobierać tak długo aż użytkownik wprowadzi literę “c”.

package com.sda.javabyd3.wowa.exg007.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers {
    public List<Integer> getNumbersFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Provide number, \"c\" ends the program: ");
            String input = sc.nextLine();

            if (input.equals("c")) {
                System.out.println("The End");
                break;
            } else {
                Integer number = Integer.parseInt(input);
                list.add(number);
            }
        }
        return list;
    }
}
