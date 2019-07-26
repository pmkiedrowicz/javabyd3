//Przygotuj aplikację weryfikującą czy wprowadzone przez użytkownika hasło jest
//poprawne. Założenia dotyczące hasła:
//Hasło składa składa się z co najmniej 8 i nie więcej niż 16 znaków
//Hasło zawiera co najmniej 2 małe literę.
//Hasło zawiera co najmniej 2 duże literę.
//Hasło zawiera co najmniej jedną cyfrę
//Hasło zawiera co najmniej jeden znak specjalny

package com.sda.javabyd3.wowa.exg008.ex08;

import java.util.Scanner;

public class PassValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide password: ");
        String usersPass = sc.nextLine();

        PassValidator p = new PassValidator();
        boolean passCorrect = p.validate(usersPass);

        if (passCorrect) {
            System.out.println("password correct");
        } else {
            System.out.println("password incorrect");
        }
        sc.close();
    }
}
