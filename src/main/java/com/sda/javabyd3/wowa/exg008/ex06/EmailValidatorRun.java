//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres e-mail
//jest poprawny. Przygotuj klasę o nazwie EmailValidator posiadającą metodę
//public boolean validate(String email);
//Przygotuj test jednostkowy sprawdzający poprawność działania.
//Poprawny e-mail: prettyandsimple@example.com, very.common@example.com,
//disposable.style.email.with+symbol@example.com, other.email-with-dash@example.com
//Błędny e-mail: john.doe@example..com, Abc.example.com, just"not"right@example.com, john..doe@example.com

package com.sda.javabyd3.wowa.exg008.ex06;

import java.util.Scanner;

public class EmailValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide email address: ");
        String usersEmail = sc.nextLine();

        EmailValidator ev = new EmailValidator();
        boolean correctEmail = ev.validate(usersEmail);

        if (correctEmail) {
            System.out.println("email is valid");
        } else {
            System.out.println("email invalid");
        }
        sc.close();
    }
}
