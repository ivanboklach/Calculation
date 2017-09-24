package operations;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 24.09.17.
 */
public class SubtractionTest {
    @Test
    public void getCalculationResult() throws Exception {
        double a = 12.0;
        double b = 2.0;
        double expResult = 10.0;
        double result = a - b;
        Assert.assertEquals(expResult, result);
    }

}