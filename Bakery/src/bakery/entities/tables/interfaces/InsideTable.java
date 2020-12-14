package bakery.entities.tables.interfaces;

public class InsideTable extends BaseTable {
    private static final double PRICE_PER_PERSON=2.50;

    public InsideTable(int tableNumber, int capacity) throws IllegalAccessException {
        super(tableNumber, capacity, PRICE_PER_PERSON);
    }
}
