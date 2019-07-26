//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres e-mail
//jest poprawny. Przygotuj klasę o nazwie EmailValidator posiadającą metodę
//public boolean validate(String email);
//Przygotuj test jednostkowy sprawdzający poprawność działania.
//Poprawny e-mail: prettyandsimple@example.com, very.common@example.com,
//disposable.style.email.with+symbol@example.com, other.email-with-dash@example.com
//Błędny e-mail: john.doe@example..com, Abc.example.com, just"not"right@example.com, john..doe@example.com

package com.sda.javabyd3.wowa.exg008.ex06;

import java.util.regex.Pattern;

public class EmailValidator {
    public boolean validate(String email) {
        Pattern p = Pattern.compile("([a-z0-9\\-\\+]+[\\.]?)+([a-z])+(@)([a-z]+(.))+[a-z]{2,}");
        boolean bool = p.matcher(email).matches();
        return bool;
    }
}
