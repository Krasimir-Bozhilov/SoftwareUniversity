
package bakery.entities.drinks;

import bakery.entities.drinks.interfaces.BaseDrink;

public class Tea extends BaseDrink {
    private static final double teaPrice = 2.5;

    public Tea(String name, int portion, String brand)  {
        super(name, portion, brand);
    }
}