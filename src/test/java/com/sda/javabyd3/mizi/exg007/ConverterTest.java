package com.sda.javabyd3.mizi.exg007;

import com.sda.javabyd3.mizi.exg007.Zad1.Converter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Michal Ziolecki.
 */
public class ConverterTest {
    @Test
    public void celciusToFehrenheit() throws Exception {
        Converter converter = new Converter();
        Assert.assertEquals( 68.00 , converter.celciusToFehrenheit( 20.0 ), 0.01 );
    }

    @Test
    public void fehrenheitToCelcius() throws Exception {
        Converter converter = new Converter();
        Assert.assertEquals( 20.00, converter.fehrenheitToCelcius( 68.0 ), 0.01 );
    }

}