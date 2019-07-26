//Przygotuj metodę sprawdzającą czy podany przez użytkownika obiekt nie jest
//null korzystając z obiektu Optional.
//Podpowiedź: Wykorzystaj metodę ofNullable oraz isPresent.

package com.sda.javabyd3.wowa.exg013.ex01;

import java.util.Scanner;

public class NullCheckerRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide string: ");
        String usersString = sc.nextLine();

        NullChecker n = new NullChecker();
        System.out.println("Is string not null? - " + n.whenNullReturnFalse(usersString));

        sc.close();
    }
}
