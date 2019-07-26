package com.sda.javabyd3.toki.exg009general.ex05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class EquationCheckerTest {
    EquationChecker equationChecker = new EquationChecker();
    String inputSum = "23+45";
    Double outputSumd = 68d;
    String inputSubstract = "23-45";
    Double outputSubstractdd = -22d;
    String inputMultiply = "23*45";
    Double outputMultiplyd = 1035d;
    String inputDivide = "11/2";
    Double outputDivided = 5.5d;
    String inputInvolution = "4^7";
    Double outputInvolutiond = 16384d;


    @Test
    public void checkForEquation() {
        Assert.assertEquals(Optional.ofNullable(outputSumd), Optional.ofNullable(equationChecker.checkForEquation(inputSum)));
        Assert.assertEquals(Optional.ofNullable(outputSubstractdd), Optional.ofNullable(equationChecker.checkForEquation(inputSubstract)));
        Assert.assertEquals(Optional.ofNullable(outputMultiplyd), Optional.ofNullable(equationChecker.checkForEquation(inputMultiply)));
        Assert.assertEquals(Optional.ofNullable(outputDivided), Optional.ofNullable(equationChecker.checkForEquation(inputDivide)));
        Assert.assertEquals(Optional.ofNullable(outputInvolutiond), Optional.ofNullable(equationChecker.checkForEquation(inputInvolution)));
    }

    @Test
    public void checkForSum() {
        String input = "22+2";
        String input2 = "22+2+2";
        String input3 = "+22+2";
        String input4 = "22+2+";
        Assert.assertTrue(String.valueOf(true), equationChecker.checkForSum(input));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSum(input2));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSum(input3));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSum(input4));
    }

    @Test
    public void checkForSubstract() {
        String input = "22-2";
        String input2 = "22-2-2";
        String input3 = "-22-2";
        String input4 = "22-2-";
        Assert.assertTrue(String.valueOf(true), equationChecker.checkForSubstract(input));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSubstract(input2));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSubstract(input3));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForSubstract(input4));
    }

    @Test
    public void checkForMultiply() {
        String input = "22*2";
        String input2 = "22*2*2";
        String input3 = "*22*2";
        String input4 = "22*2*";
        Assert.assertTrue(String.valueOf(true), equationChecker.checkForMultiply(input));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForMultiply(input2));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForMultiply(input3));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForMultiply(input4));
    }

    @Test
    public void checkForDivide() {
        String input = "22/2";
        String input2 = "22/2/2";
        String input3 = "/22/2";
        String input4 = "22/2/";
        Assert.assertTrue(String.valueOf(true), equationChecker.checkForDivide(input));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForDivide(input2));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForDivide(input3));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForDivide(input4));
    }

    @Test
    public void checkForInvolution() {
        String input = "22^2";
        String input2 = "22^2^2";
        String input3 = "^22^2";
        String input4 = "22^2^";
        Assert.assertTrue(String.valueOf(true), equationChecker.checkForInvolution(input));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForInvolution(input2));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForInvolution(input3));
        Assert.assertFalse(String.valueOf(false), equationChecker.checkForInvolution(input4));
    }
}