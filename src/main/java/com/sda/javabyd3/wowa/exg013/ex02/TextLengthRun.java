//Przygotuj metodę zwracającą długość podanego przez użytkownika tekstu
//korzystając z obiektu Optional nie wykorzystując instrukcji warunkowej if.
//Podpowiedź:
//Korzystając z metody map pobierz długość tekstu. Jeśli zwrócona długość jest
//null to korzystając z metody orElse zwróć -1

package com.sda.javabyd3.wowa.exg013.ex02;

import java.util.Scanner;

public class TextLengthRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide string to count: ");
        String usersString = sc.nextLine();

        TextLength tl = new TextLength();
        System.out.println("String's length (if null = -1): " + tl.checkLength(usersString));

        sc.close();
    }
}
