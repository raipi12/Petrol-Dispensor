import javax.xml.crypto.Data;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Calculator {

    public static double counting(double money){
        if (money < 0)
            throw new NumberFormatException("Enter an amount greater than 0");

        double litres = money / Price.getPrice();

        System.out.printf("The following amount of diesel will be added to your car -> %.2f", + litres);

        return litres;
    }
}
