//Rozbuduj aplikację z poprzedniego zadania tak aby mechanizm sprawdzający
//weryfikował też numer kierunkowy kraju. Przykładowo numer telefonu +48505888159
//jak i 505888159 jest poprawny.

package com.sda.javabyd3.wowa.exg008.ex02;

import java.util.Scanner;

public class BetterPhoneValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide phone number (allowed formats - 505879357, 505 879 357, 505-879-357, +45333444555," +
                " +43111-222-333, +45444 333 222): ");
        String usersPhone = sc.nextLine();

        BetterPhoneValidator bv = new BetterPhoneValidator();
        boolean correctNumber = bv.validate(usersPhone);

        if (correctNumber) {
            System.out.println("correct number");
        } else {
            System.out.println("incorrect number");
        }

        sc.close();
    }
}
