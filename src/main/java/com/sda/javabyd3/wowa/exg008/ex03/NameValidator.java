//Przygotuj aplikację sprawdzającą czy wprowadzone imię jest poprawne. Użytkownik
//wprowadza tekst w postaci “Jan”, a następnie program sprawdza jego poprawność.
//Przygotuj klasę o nazwie NameValidator posiadającą metodę public boolean validate(String name);
//Poprawne imię to: Jan, Monika, Łukasz, Krzysztof
//Błędne imię to: jan, monika, jan87, Jan87
//Imię uważa się za poprawne, gdy zawiera tylko litery i rozpoczyna się wielką literą.

package com.sda.javabyd3.wowa.exg008.ex03;

import java.util.regex.Pattern;

public class NameValidator {
    public boolean validate(String name) {
        Pattern p = Pattern.compile("[A-ZĄĘÓŚŁŻŹĆŃ]{1}[a-ząęóśłżźćń]+");
        boolean bool = p.matcher(name).matches();
        return bool;
    }
}
