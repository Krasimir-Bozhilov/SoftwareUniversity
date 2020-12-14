package bakery.core.interfaces;

public interface Controller {
   String addFood(String type, String name, double price) throws IllegalAccessException;

   String addDrink(String type, String name, int portion, String brand) throws IllegalAccessException;

   String addTable(String type, int tableNumber, int capacity) throws IllegalAccessException;

   String reserveTable(int numberOfPeople);

   String orderFood(int tableNumber, String foodName);

   String orderDrink(int tableNumber, String drinkName, String drinkBrand);

   String leaveTable(int tableNumber);

   String getFreeTablesInfo();

   String getTotalIncome();
}
