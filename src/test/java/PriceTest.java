import org.junit.Assert;
import org.junit.Test;

public class PriceTest {

    @Test (expected = NumberFormatException.class)
    public void priceShouldBePositiv(){
        Price.setPrice(-15.99);
    }
}
