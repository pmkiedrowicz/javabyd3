//Przygotuj aplikację sprawdzającą czy wprowadzony przez użytkownika adres www
//jest poprawny
//public boolean validate(String www);
//Poprawny adres www to: www.wp.pl
//Błędny adres www to: http://, http://-error-.invalid/, http://foo.bar/foo(bar)baz quux,
//http:///www.wp.pl

package com.sda.javabyd3.wowa.exg008.ex05;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class WwwValidatorTest {
    WwwValidator www = new WwwValidator();

    @Test
    public void isWwwAddressOK() {
        boolean result1 = www.validate("www.onet.pl");
        boolean result2 = www.validate("www.java.co.uk");
        boolean result3 = www.validate("www.szczecin.com.pl");
        Assert.assertThat(result1, is(true));
        Assert.assertThat(result2, is(true));
        Assert.assertThat(result3, is(true));
    }

    @Test
    public void isWwwAddressInvalid() {
        String address1 = "http://";
        String address2 = "http://-error-.invalid/";
        String address3 = "http://foo.bar/foo(bar)baz quux";
        String address4 = "http:///www.wp.pl";

        Assert.assertFalse(address1, www.validate(address1));
        Assert.assertFalse(address2, www.validate(address2));
        Assert.assertFalse(address3, www.validate(address3));
        Assert.assertFalse(address4, www.validate(address4));
    }
}
