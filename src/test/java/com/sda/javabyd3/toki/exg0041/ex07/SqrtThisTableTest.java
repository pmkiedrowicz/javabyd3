package com.sda.javabyd3.toki.exg0041.ex07;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class SqrtThisTableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingMaxValue() {
        JustForInputInt justForInputInt = new JustForInputInt();
        SqrtThisTable sqrtThisTable = new SqrtThisTable();
        int[] inPut = {22, 56, 82};
        double[] doubles = {22, 56, 82};
//        double[] outPut = new double[inPut.length];
//        for (int i = 0; i < inPut.length; i++) {
//            outPut[i] = inPut[i];
//        }
        double[] outPut = {4.69, 7.48, 9.06};
        Assert.assertEquals("StreamIntTable does not work correctly. Expected '4.69, 7.48, 9.06' but got: " + sqrtThisTable, Arrays.toString(outPut),
                Arrays.toString(sqrtThisTable.sqrtThis(doubles)));
    }
}