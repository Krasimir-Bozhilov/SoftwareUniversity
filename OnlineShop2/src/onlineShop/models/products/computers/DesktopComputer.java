package onlineShop.models.products.computers;

import onlineShop.models.products.components.BaseComponent;

public class DesktopComputer extends BaseComponent {
    private static final double OVER_ALL_PERFORMANCE=15;
    public DesktopComputer(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price,OVER_ALL_PERFORMANCE, generation);
    }
}
