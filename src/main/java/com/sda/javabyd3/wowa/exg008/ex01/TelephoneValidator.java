//Napisz aplikację sprawdzającą czy wprowadzony przez użytkownika numer telefonu
//jest poprawny. Przygotuj klasę o nazwie TelephoneValidator posiadającą
//metodę public boolean validate(String telephone);
//Podany telefon uważa się za poprawny gdy składa się z 9 cyfr.
//Poprawny numer telefonu to: 505879357, 505 879 357, 505-879-357
//Błędny numer telefonu to: 50 58 79 35 7, 5058794, 44505879357

package com.sda.javabyd3.wowa.exg008.ex01;

import java.util.regex.Pattern;

public class TelephoneValidator {
    public boolean validate(String telephone) {
        //String pattern = "\\d{9}|(?:\\d{3}-){2}\\d{3}|(?:\\d{3} ){2}\\d{3}";
        Pattern p = Pattern.compile("\\d{9}|(?:\\d{3}-){2}\\d{3}|(?:\\d{3} ){2}\\d{3}");
        boolean bool = p.matcher(telephone).matches();
        return bool;
    }
}
