//Rozbuduj aplikację z poprzedniego zadania tak aby mechanizm sprawdzający
//weryfikował też numer kierunkowy kraju. Przykładowo numer telefonu +48505888159
//jak i 505888159 jest poprawny.

package com.sda.javabyd3.wowa.exg008.ex02;

import java.util.regex.Pattern;

public class BetterPhoneValidator {
    public boolean validate(String telephone) {
        Pattern p = Pattern.compile("" +
                "^([+][0-9]{2})?[0-9]{9}$|" +
                "^([+][0-9]{2})?([0-9]{3}[ ]){2}[0-9]{3}$|" +
                "^([+][0-9]{2})?([0-9]{3}[-]){2}[0-9]{3}$");
        boolean bool = p.matcher(telephone).matches();
        return bool;
    }
}
