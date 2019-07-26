package com.sda.javabyd3.urdu.exg011.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    Function function = new Function();

    @Test
    public void equationSolutionWhenDeltaIsSmallerThen0() {
        String result=function.equationSolution(1,2,3);
        Assert.assertEquals(result,"Brak rozwiązań rzeczywistych.");
    }

    @Test
    public void equationSolutionWhenDeltaIsLargerThen0() {
        String result=function.equationSolution(-2,3,-1);
        Assert.assertEquals(result,"Pierwiastki X1= 0.5, X2: 1.0");
    }

    @Test
    public void equationSolutionWhenDeltaIsEquals0() {
        String result=function.equationSolution(4,4,1);
        Assert.assertEquals(result,"Pierwiastek X = -0.5");

    }
    @Test
    public void getDelta() {

        Assert.assertTrue("Result is incorrect, expected that delta is <0",function.getDelta(1,2,3)<0);
        Assert.assertTrue("Result is incorrect, expected that delta is >0",function.getDelta(-2,3,-1)>0);
        Assert.assertTrue("Result is incorrect, expected that delta is =0",function.getDelta(4,4,1)==0);

    }
}