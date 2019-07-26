package com.sda.javabyd3.toki.exg0041.ex03;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class StreamIntTableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingMaxValue() {
        StreamIntTable streamIntTable = new StreamIntTable();
        int[] inPut = {22, 56, 23, 4, 24};
        int[] outPut = {25};
        Assert.assertEquals("StreamIntTable does not work correctly. Expected '25' but got: " + streamIntTable, Arrays.toString(outPut),
                Arrays.toString(streamIntTable.StreamThisIntTable(inPut)));
    }
}