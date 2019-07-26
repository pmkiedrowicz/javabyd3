//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres IP jest poprawny.
//public boolean validate(String address);
//Poprawny adres IP: 192.168.1.10, 10.10.48.1
//Błędny adres IP: 192.168.256.20, 192.168.2,

package com.sda.javabyd3.wowa.exg008.ex07;

import java.util.regex.Pattern;

public class IpValidator {
    public boolean validate(String address) {
        Pattern ip = Pattern.compile("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}" +
                "(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");
        boolean bool = ip.matcher(address).matches();
        return bool;
    }
}
