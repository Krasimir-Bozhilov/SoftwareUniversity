package bakery.core;

import bakery.common.ExceptionMessages;
import bakery.common.OutputMessages;
import bakery.core.interfaces.Controller;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.bakedFoods.interfaces.BaseFood;
import bakery.entities.bakedFoods.interfaces.Bread;
import bakery.entities.bakedFoods.interfaces.Cake;
import bakery.entities.drinks.interfaces.BaseDrink;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.drinks.interfaces.Tea;
import bakery.entities.drinks.interfaces.Water;
import bakery.entities.tables.interfaces.InsideTable;
import bakery.entities.tables.interfaces.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.*;

import java.util.List;
import java.util.stream.Collectors;

import static bakery.common.enums.DrinkType.Tea;

public class ControllerImpl implements Controller {


    private final FoodRepository<BakedFood> foodRepository;
    private final DrinkRepository<Drink> drinkRepository;
    private final TableRepository<Table> tableRepository;
    private  double totalIncome=0;

    public ControllerImpl(FoodRepository<BakedFood> foodRepository, DrinkRepository<Drink> drinkRepository, TableRepository<Table> tableRepository) {


        this.foodRepository = foodRepository;
        this.drinkRepository = drinkRepository;
        this.tableRepository = tableRepository;
    }


    @Override
    public String addFood(String type, String name, double price) {
        BakedFood newFood = null;
        switch (type) {
            case "Bread":
                newFood = new Bread(name, price);
                break;
            case "Cake":
                newFood = new Cake(name, price);
                break;
        }
        if (foodRepository.getAll().contains(newFood)) {
            return String.format(ExceptionMessages.FOOD_OR_DRINK_EXIST, type, name);
        } else {
            foodRepository.add(newFood);

            return String.format(OutputMessages.FOOD_ADDED, name, type);
        }

    }

    @Override
    public String addDrink(String type, String name, int portion, String brand) {
        BaseDrink newDrink = null;
        switch (type) {
            case "Tea":
                newDrink = new Tea(name, portion, brand);
                break;
            case "Water":
                newDrink = new Water(name, portion, brand);
                break;
        }
        if (drinkRepository.getAll().contains(newDrink)) {
            return String.format(ExceptionMessages.FOOD_OR_DRINK_EXIST, type, name);
        } else {
            drinkRepository.add(newDrink);
            return String.format(OutputMessages.DRINK_ADDED, name, brand);
        }
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table newTable = null;
        switch (type) {
            case "InsideTable":
                newTable = new InsideTable(tableNumber, capacity);
                break;
            case "OutsideTable":
                newTable = new OutsideTable(tableNumber, capacity);
                break;
        }
        if (tableRepository.getAll().contains(newTable)) {
           return String.format(ExceptionMessages.TABLE_EXIST, tableNumber);
        } else {
            tableRepository.add(newTable);
            return String.format(OutputMessages.TABLE_ADDED, tableNumber);
        }
    }

    @Override
    public String reserveTable(int numberOfPeople) {
        Table freeTable = null;
        for (Table table : tableRepository.getAll()) {
            if (!table.isReserved() && table.getCapacity() <= numberOfPeople) {
                freeTable = table;
                break;
            }

        }
        if (freeTable == null) {
            return String.format(OutputMessages.WRONG_TABLE_NUMBER, numberOfPeople);
        } else {
            freeTable.reserve(numberOfPeople);
            return String.format(OutputMessages.TABLE_RESERVED, freeTable.getTableNumber(), numberOfPeople);

        }

    }

    @Override
    public String orderFood(int tableNumber, String foodName) {

        Table table = tableRepository.getByNumber(tableNumber);
        BakedFood food = foodRepository.getByName(foodName);

        if (table == null || !table.isReserved()) {
            return String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber);
        }

        if (food == null) {
            return String.format(OutputMessages.NONE_EXISTENT_FOOD, foodName);
        }

        table.orderFood(food);
        return String.format(OutputMessages.FOOD_ORDER_SUCCESSFUL, tableNumber, foodName);
    }


    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {
        Table table = tableRepository.getByNumber(tableNumber);
        Drink drink =drinkRepository.getByNameAndBrand(drinkName,drinkBrand);

        if (table == null || !table.isReserved()) {
            return String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber);
        }

        if (drink == null) {
            return String.format(OutputMessages.NON_EXISTENT_DRINK,drinkName,drinkBrand);
        }

        table.orderDrink(drink);
        return String.format(OutputMessages.DRINK_ORDER_SUCCESSFUL,tableNumber,drinkName,drinkBrand);


    }

    @Override
    public String leaveTable(int tableNumber) {
        Table leaveTable=tableRepository.getByNumber(tableNumber);
      double bill= leaveTable.getBill();
      leaveTable.clear();
      this.totalIncome+=bill;
      return String.format(OutputMessages.BILL,tableNumber,bill);
    }

    @Override
    public String getFreeTablesInfo() {
        List<Table> notReserved = tableRepository.getAll().stream().filter(t -> !t.isReserved()).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Table table : notReserved) {
            sb.append(table.getFreeTableInfo());
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    @Override
    public String getTotalIncome() {

        return String.format("Total income: %.2flv", this.totalIncome);
    }
}