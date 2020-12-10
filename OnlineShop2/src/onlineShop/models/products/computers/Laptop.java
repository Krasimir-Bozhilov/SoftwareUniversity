package onlineShop.models.products.computers;

public class Laptop extends BaseComputer {
    private static final double OVER_ALL_PERFORMANCE=10;
   public Laptop(int id, String manufacturer, String model, double price, double overallPerformance) {
        super(id, manufacturer, model, price, OVER_ALL_PERFORMANCE);
    }
}
