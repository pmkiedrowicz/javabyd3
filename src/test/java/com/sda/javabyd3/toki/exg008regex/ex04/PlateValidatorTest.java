package com.sda.javabyd3.toki.exg008regex.ex04;

import org.junit.Assert;
import org.junit.Test;

public class PlateValidatorTest {
PlateValidator plateValidator=new PlateValidator();

    @Test
    public void validatePlateForTrue() {
        String plate="CB3456J";
        String plate2="CB34212";
        String plate3="WY640WI";
        Assert.assertTrue(plate, plateValidator.validate(plate));
        Assert.assertTrue(plate2, plateValidator.validate(plate2));
        Assert.assertTrue(plate3, plateValidator.validate(plate3));
    }

    @Test
    public void validatePlateForFalse(){
        String plate="CBS3456";
        String plate2="W1234YU";
        String plate3="CC14WYG";
        Assert.assertFalse(plate, plateValidator.validate(plate));
        Assert.assertFalse(plate2, plateValidator.validate(plate2));
        Assert.assertFalse(plate3, plateValidator.validate(plate3));

    }
}