//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres www
//jest poprawny public boolean validate(String www);
//Poprawny adres www to: www.wp.pl
//Błędny adres www to: http://, http://-error-.invalid/, http://foo.bar/foo(bar)baz quux,
//http:///www.wp.pl

package com.sda.javabyd3.wowa.exg008.ex05;

import java.util.regex.Pattern;

public class WwwValidator {
    public boolean validate(String www) {
        Pattern p = Pattern.compile("(www.)([a-z0-9]+(.))+[a-z]{2,}");
        boolean bool = p.matcher(www).matches();
        return bool;
    }
}
