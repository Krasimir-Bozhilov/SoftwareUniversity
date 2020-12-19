package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpaceshipTests {

    Spaceship spaceship1 = new Spaceship("Ivan", 3);


    List<Astronaut> astronauts = new ArrayList<>();
    Astronaut astronaut1 = new Astronaut("Misho", 5.00);
    Astronaut astronaut2 = new Astronaut("Tosho", 10.00);
    Astronaut astronaut3 = new Astronaut("Ivo", 15.00);
    Astronaut astronaut4 = new Astronaut("Miko", 20.00);

    @Test
    public void testConstructor15(){
        List<Astronaut> astronauts1 = new ArrayList<>();
        Astronaut astronaut11 = new Astronaut("Gosho", 152.00);
        astronauts1.add(astronaut11);
        Assert.assertEquals("Gosho",astronauts1.get(0).getName());
        Assert.assertEquals(152,astronauts1.get(0).getOxygenInPercentage(),0.00);

    }
    @Test
    public void testCount() {
        Assert.assertEquals(0, spaceship1.getCount());

    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Ivan", spaceship1.getName());

    }

    @Test
    public void testGetCapacity() {
        Assert.assertEquals(3, spaceship1.getCapacity());

    }


    @Test
    public void testConstructor() {
        Spaceship spaceship1 = new Spaceship("Zdravko", 2);
        Assert.assertEquals("Zdravko", spaceship1.getName());
        Assert.assertEquals(2, spaceship1.getCapacity());


    }

    @Test
    public void testConstructor2() {
        astronauts.add(astronaut1);
        Assert.assertEquals("Misho", astronauts.get(0).getName());
        Assert.assertEquals(5.00, astronauts.get(0).getOxygenInPercentage(), 0.00);

    }

    @Test
    public void testConstructor3() {

        Assert.assertEquals(0, astronauts.size());


    }

    @Test
    public void testGetCount() {
        Assert.assertEquals(0, astronauts.size());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd() {
        spaceship1.add(astronaut1);
        spaceship1.add(astronaut1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd2() {

        spaceship1.add(astronaut1);
        spaceship1.add(astronaut2);
        spaceship1.add(astronaut3);
        spaceship1.add(astronaut4);


    }

    @Test
    public void testAdd3() {
        spaceship1.add(astronaut1);
        astronauts.add(astronaut1);
        Assert.assertEquals(astronaut1.getName(), astronauts.get(0).getName());
        Assert.assertEquals(astronaut1.getOxygenInPercentage(), astronauts.get(0).getOxygenInPercentage(), 0.0);

    }

    @Test
    public void testRemove() {
        boolean val = spaceship1.remove(astronaut1.getName());
        Assert.assertEquals(val, spaceship1.remove(astronaut1.getName()));
    }

    @Test
    public void testRemove2() {
        spaceship1.add(astronaut1);

        Assert.assertEquals(true, spaceship1.remove(astronaut1.getName()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd10() {
        spaceship1.add(astronaut1);
        spaceship1.add(astronaut1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd11() {
        spaceship1.add(astronaut1);
        spaceship1.add(astronaut2);
        spaceship1.add(astronaut3);
        spaceship1.add(astronaut4);
    }


}
