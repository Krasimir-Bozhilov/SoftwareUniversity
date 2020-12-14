package bakery.entities.tables.interfaces;

import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.interfaces.Drink;

import java.util.Collection;
import java.util.Collections;

import static bakery.common.ExceptionMessages.*;

public abstract class BaseTable implements Table {
    private Collection<BakedFood> foodOrders;
    private Collection<Drink> drinkOrders;
    private int tableNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved=false;
    private double price;

    protected BaseTable(int tableNumber, int capacity, double pricePerPerson) {
        this.tableNumber=tableNumber;
        this.setCapacity(capacity);
        this.pricePerPerson=pricePerPerson;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setCapacity(int capacity) {
        if (capacity<=0){
            throw new IllegalAccessException(INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople<=0){
            throw new IllegalAccessException(INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getTableNumber() {
        return this.tableNumber;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double getPricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReserved() {
        return this.isReserved;
    }

    @Override
    public double getPrice() {
        return this.getPrice();
    }

    @Override
    public void reserve(int numberOfPeople) {
        this.numberOfPeople=numberOfPeople;
        isReserved=true;

    }

    @Override
    public void orderFood(BakedFood food) {
        foodOrders.add(food);

    }

    @Override
    public void orderDrink(Drink drink) {
    drinkOrders.add(drink);
    }

    @Override
    public double getBill() {
        double foodPrice=0;
        double drinkPrice=0;
        for (BakedFood foodOrder : foodOrders) {

            foodPrice+=foodOrder.getPrice();

        }
        for (Drink drinkOrder : drinkOrders) {

            drinkPrice+=drinkOrder.getPrice();
        }
        return foodPrice+drinkPrice;
    }

    @Override
    public void clear() {
        foodOrders.clear();
        drinkOrders.clear();
        this.numberOfPeople=0;
        isReserved=false;

    }

    @Override
    public String getFreeTableInfo() {
        StringBuilder sb =new StringBuilder();
        String tableNum=String.format("Table: %d",this.tableNumber);
        sb.append(tableNum);
        sb.append(System.lineSeparator());
        String tableType=String.format("Table: %s",this.getClass().getSimpleName());
        sb.append(tableType);
        sb.append(System.lineSeparator());
        String tableCapacity=String.format("Table: %d",this.capacity);
        sb.append(tableType);
        sb.append(System.lineSeparator());
        String tablePerPerson=String.format("Table: %.2f",this.pricePerPerson);
        sb.append(tablePerPerson);
        sb.append(System.lineSeparator());

        return sb.toString().trim();
    }
}
