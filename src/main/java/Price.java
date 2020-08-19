import java.util.ArrayList;

public class Price {
    private static double price = 13.55;

    public static void setPrice(double price) {
        Price.price = price;
        if (price < 0)
            throw new NumberFormatException("Enter a price greater than 0");
    }

    public static double getPrice() {
        return price;
    }
}
