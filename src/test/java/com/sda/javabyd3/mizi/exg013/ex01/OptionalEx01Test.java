package com.sda.javabyd3.mizi.exg013.ex01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class OptionalEx01Test {
    @Test
    public void stringObjCreator() throws Exception {

        OptionalEx01 optionalEx01 = new OptionalEx01();
        String test = null;
        Assert.assertTrue( "Check Instance of String in method",
                Optional.ofNullable( optionalEx01.stringObjCreator("abc") ).isPresent());
        Assert.assertFalse( Optional.ofNullable( optionalEx01.stringObjCreator( test ) ).isPresent() );
        Assert.assertEquals( "abc",
                Optional.ofNullable( optionalEx01.stringObjCreator( "abc" ) ).orElse( "empty" ) );

    }

    @Test
    public void objCreator() throws Exception {
        OptionalEx01 optionalEx01 = new OptionalEx01();
        Optional.ofNullable( optionalEx01.ObjCreator() ).isPresent();
    }

}