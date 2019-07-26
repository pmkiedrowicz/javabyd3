//Przygotuj aplikację sprawdzającą czy wprowadzone imię jest poprawne. Użytkownik
//wprowadza tekst w postaci “Jan”, a następnie program sprawdza jego poprawność.
//Przygotuj klasę o nazwie NameValidator posiadającą metodę public boolean validate(String name);
//Poprawne imię to: Jan, Monika, Łukasz, Krzysztof
//Błędne imię to: jan, monika, jan87, Jan87
//Imię uważa się za poprawne, gdy zawiera tylko litery i rozpoczyna się wielką literą.

package com.sda.javabyd3.wowa.exg008.ex03;

import java.util.Scanner;

public class NameValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a name which starts with an uppercase character: ");
        String usersName = sc.nextLine();

        NameValidator nv = new NameValidator();
        boolean correctName = nv.validate(usersName);

        if (correctName) {
            System.out.println("correct name");
        } else {
            System.out.println("incorrect name");
        }
        sc.close();
    }
}
