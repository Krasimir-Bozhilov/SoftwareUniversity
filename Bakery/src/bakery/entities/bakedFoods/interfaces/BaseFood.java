package bakery.entities.bakedFoods.interfaces;

import static bakery.common.ExceptionMessages.*;

public abstract class BaseFood implements BakedFood {

    private String name;
    private double portion;
    private double price;

    protected BaseFood(String name, double portion, double price) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
    }

    public void setName(String name)  {
        if (name.equals(" ")||name.equals("")){
            throw new IllegalAccessException(INVALID_NAME);
        }
        this.name = name;
    }

    public void setPortion(double portion)  {
        if (portion<=0){
            throw new IllegalAccessException(INVALID_PORTION);
        }
        this.portion = portion;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new IllegalAccessException(INVALID_PRICE);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s: " +
                "%.2fg - " +
                "%.2f",this.getName(),this.getPortion(),this.getPrice());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPortion() {
        return this.portion;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
