package com.sda.javabyd3.toki.exg008regex.ex05;

import org.junit.Assert;
import org.junit.Test;

public class WWWAddressValidateTest {
    WWWAddressValidate wwwAddressValidate = new WWWAddressValidate();

    @Test
    public void validateForTrue() {
        String address = "www.wp.pl";
        String address2 = "www.f32f23.g43g34.pl";
        String address3 = "www.f32g23.g32g3.g43g43.g43g43.info";
        String address4 = "www.f32f2.g23g2.g23.g3.zui";

        Assert.assertTrue(address, wwwAddressValidate.validate(address));
        Assert.assertTrue(address2, wwwAddressValidate.validate(address2));
        Assert.assertTrue(address3, wwwAddressValidate.validate(address3));
        Assert.assertTrue(address4, wwwAddressValidate.validate(address4));
    }

    @Test
    public void validate() {
    }
}