package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;
    private static final Integer[] NUMBERS = {5, 9, 29, 45};

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }


    @Test
    public void testConstructorHasToCreateValidObject() throws OperationNotSupportedException {
        Integer[] databaseNumbers = database.getElements();

        Assert.assertEquals(NUMBERS.length, databaseNumbers.length);
        for (int i = 0; i < databaseNumbers.length; i++) {
            Assert.assertEquals(NUMBERS[i], databaseNumbers[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenUseMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenUseLessThanOneElement() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAdd() throws OperationNotSupportedException {
        database.add(null);
    }
    @Test
    public void testAddShouldAddElement () throws OperationNotSupportedException {
        database.add(17);

        Assert.assertEquals(5, database.getElements().length);
        Assert.assertEquals(Integer.valueOf(17), database.getElements()[4]);
    }


    @Test (expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExWithEmptyData () throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }

        database.remove();
    }

    @Test
    public void testRemoveLastElement () throws OperationNotSupportedException {
        database.remove();
        Integer [] elementsInDatabase = database.getElements();
        Assert.assertEquals(NUMBERS.length - 1, elementsInDatabase.length);
        Assert.assertEquals(Integer.valueOf(29), elementsInDatabase[elementsInDatabase.length - 1]);
        for (int i = 0; i < elementsInDatabase.length; i++) {
            Assert.assertEquals(elementsInDatabase[i], NUMBERS[i]);
        }
    }

}
