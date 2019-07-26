package com.sda.javabyd3.toki.exg0041.ex06;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class StreamThisTableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingMaxValue() {
        StreamThisTable streamIntTable = new StreamThisTable();
        int[] inPut = {22, 56, 82, 23, 4, 667, 669, 712, 768, 769};
        int[] outPut = {667, 669, 712, 768, 769};
        Assert.assertEquals("StreamIntTable does not work correctly. Expected '101,213,225,321,536' but got: " + streamIntTable, Arrays.toString(outPut),
                Arrays.toString(streamIntTable.streamIntTable(inPut)));
    }
}