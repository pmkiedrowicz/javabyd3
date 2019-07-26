//Przygotuj aplikację weryfikującą czy wprowadzone przez użytkownika hasło jest
//poprawne. Założenia dotyczące hasła:
//Hasło składa składa się z co najmniej 8 i nie więcej niż 16 znaków
//Hasło zawiera co najmniej 2 małe literę.
//Hasło zawiera co najmniej 2 duże litery.
//Hasło zawiera co najmniej jedną cyfrę
//Hasło zawiera co najmniej jeden znak specjalny

package com.sda.javabyd3.wowa.exg008.ex08;

import java.util.regex.Pattern;

public class PassValidator {
    public boolean validate(String pass) {
        Pattern password = Pattern.compile("^(?=.{8,16}$)(?=.*[A-Z].*[A-Z])(?=.*[a-z].*[a-z])(?=.*[^A-Za-z0-9])(?=.*[0-9]).*");
        boolean bool = password.matcher(pass).matches();
        return bool;
    }
}
