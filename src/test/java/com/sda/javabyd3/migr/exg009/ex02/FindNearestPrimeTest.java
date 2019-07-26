

import com.sda.javabyd3.migr.exg009.ex02.FindNearestPrime;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestPrimeTest {

    @Test
    public void findPrimeWhenPrimaryNumberIsLargerThanProvided() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 10;
        Integer exprectedPrime = 11;
        Assert.assertEquals(exprectedPrime,findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenPrimaryNumberIsSmallerThanProvided() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime,findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenPrimaryNumberIsBigger (){
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 12;
        Integer expectedPrime = 13;
        Assert.assertEquals(expectedPrime,findNearestPrime.findPrime(number));

    }
}