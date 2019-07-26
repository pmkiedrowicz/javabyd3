package com.sda.javabyd3.mizi.tdd.RaceTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class PitStopTest {

    PitStop pitStop = new PitStop();

    @Test
    public void refueling() throws Exception {
        Assert.assertEquals( 100.0, pitStop.refueling( 69.0 ), 0.1 );
    }

    @Test
    public void changeTires() throws Exception {
        Assert.assertEquals(100, pitStop.changeTires( 69 ) );
    }

    @Test
    public void washCar() throws Exception {
        Assert.assertFalse( pitStop.washCar( true ) );
    }

}