package bakery.entities.bakedFoods.interfaces;

public class Bread extends BaseFood {
    private static final double portion=200;
 public Bread(String name,double price){
        super(name,price, portion);

    }
}
