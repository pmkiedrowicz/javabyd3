//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres IP
//jest poprawny.
//public boolean validate(String address);
//Poprawny adres IP: 192.168.1.10, 10.10.48.1
//Błędny adres IP: 192.168.256.20, 192.168.2,

package com.sda.javabyd3.wowa.exg008.ex07;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class IpValidatorTest {
    IpValidator iv = new IpValidator();

    @Test
    public void isIPValid() {
        boolean result1 = iv.validate("192.168.1.10");
        boolean result2 = iv.validate("10.10.48.1");
        boolean result3 = iv.validate("10.0.48.1");

        Assert.assertThat(result1, is(true));
        Assert.assertThat(result2, is(true));
        Assert.assertThat(result3, is(true));
    }

    @Test
    public void isIPInvalid() {
        String ip1 = "192.168.256.20";
        String ip2 = "192.168.2";
        String ip3 = "092.168.2.4";

        Assert.assertFalse(ip1, iv.validate(ip1));
        Assert.assertFalse(ip2, iv.validate(ip2));
        Assert.assertFalse(ip3, iv.validate(ip3));
    }
}
