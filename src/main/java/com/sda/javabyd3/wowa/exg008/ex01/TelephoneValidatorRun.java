//Napisz aplikację sprawdzającą czy wprowadzony przez użytkownika numer telefonu
//jest poprawny. Przygotuj klasę o nazwie TelephoneValidator posiadającą
//metodę public boolean validate(String telephone);
//Podany telefon uważa się za poprawny gdy składa się z 9 cyfr.
//Poprawny numer telefonu to: 505879357, 505 879 357, 505-879-357
//Błędny numer telefonu to: 50 58 79 35 7, 5058794, 44505879357

package com.sda.javabyd3.wowa.exg008.ex01;

import java.util.Scanner;

public class TelephoneValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide phone number (allowed formats - 505879357, 505 879 357, 505-879-357): ");
        String usersPhone = sc.nextLine();

        TelephoneValidator tv = new TelephoneValidator();
        boolean correctNumber = tv.validate(usersPhone);

        if (correctNumber) {
            System.out.println("correct number");
        } else {
            System.out.println("incorrect number");
        }

        sc.close();
    }
}
