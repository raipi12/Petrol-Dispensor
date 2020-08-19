import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final double EPS = 1e-2;

    @Test (expected = NumberFormatException.class)
    public void theAmountEnteredShouldBePositive(){
        Calculator.counting(-200);
    }
    @Test
    public void resultShouldBePositive(){
        Price.setPrice(15.99);
        Assert.assertEquals(25.016, Calculator.counting(400), EPS);
    }
}
