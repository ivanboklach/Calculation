package operations;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macbook on 24.09.17.
 */
public class DivisionTest {
    @Test
    public void getCalculationResult() throws Exception {
        double a = 6.0;
        double b = 2.0;
        double expResult = 3.0;
        double result = Division.getCalculationResult(a, b)
        Assert.assertEquals(expResult, result);
    }

}