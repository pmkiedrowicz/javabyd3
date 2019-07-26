package com.sda.javabyd3.toki.exg008regex.ex07;

import org.junit.Assert;
import org.junit.Test;

public class IPCheckerTest {
    IPChecker ipChecker = new IPChecker();

    @Test
    public void validate() {
        String addressForTrue = "192.168.1.10";
        String addressForTrue2 = "10.10.48.1";

        Assert.assertTrue(ipChecker.validate(addressForTrue));
        Assert.assertTrue(ipChecker.validate(addressForTrue2));

        String addressForFalse = "192.168.256.20";
        String addressForFalse2 = "192.168.2";

        Assert.assertFalse(ipChecker.validate(addressForFalse));
        Assert.assertFalse(ipChecker.validate(addressForFalse2));
    }

    @Test
    public void validateInRealRange() {
        String addressForTrue="0.0.0.0";
        String addressForTrue2="10.10.10.10";
        String addressForTrue3="100.100.100.100";
        String addressForTrue4="255.255.255.255";

        Assert.assertTrue(ipChecker.validateInRealRange(addressForTrue));
        Assert.assertTrue(ipChecker.validateInRealRange(addressForTrue2));
        Assert.assertTrue(ipChecker.validateInRealRange(addressForTrue3));
        Assert.assertTrue(ipChecker.validateInRealRange(addressForTrue4));

        String addressForFalse="01.01.01.01";
        String addressForFalse2="001.001.001.001";
        String addressForFalse3="010.010.010.010";
        String addressForFalse4="256.0.0.0";

        Assert.assertFalse(ipChecker.validateInRealRange(addressForFalse));
        Assert.assertFalse(ipChecker.validateInRealRange(addressForFalse2));
        Assert.assertFalse(ipChecker.validateInRealRange(addressForFalse3));
        Assert.assertFalse(ipChecker.validateInRealRange(addressForFalse4));

    }
}