package operations;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 24.09.17.
 */
public class AdditionTest {
    @Test
    public void getCalculationResult() throws Exception {
        double a = 5.0;
        double b = 2.0;
        double expResult = 7.0;
        double result = Addition.getCalculationResult(a, b);
        Assert.assertEquals(expResult, result);
    }

}