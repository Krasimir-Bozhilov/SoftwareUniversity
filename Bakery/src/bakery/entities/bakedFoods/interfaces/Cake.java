package bakery.entities.bakedFoods.interfaces;

public class Cake extends BaseFood {
    private static final double FINAL_PORTION=245;
  public Cake(String name,  double price) throws IllegalAccessException {
        super(name, FINAL_PORTION, price);
    }
}
