package computers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ComputerManagerTests {
    // TODO: Test ComputerManager
    Computer computer=new Computer("Dell","Inspirion",1200.00);
    ComputerManager computer1=new ComputerManager();
    ComputerManager computer2=new ComputerManager();
    @Before
    public void setComputer(){
        List<Computer>computers=new ArrayList<>();
        computers.add(computer);
    }
    @Test
    public void testConstructor(){
        Assert.assertEquals("Dell",computer.getManufacturer());
        Assert.assertEquals("Inspirion",computer.getModel());
        Assert.assertEquals(1200.00,computer.getPrice(),0.0);

    }
    @Test
    public void testGetCount(){
        List<Computer>computers=new ArrayList<>();
        computers.add(computer);
        Assert.assertEquals(1,computers.size());
    }
    @Test(expected= IllegalArgumentException.class)
    public void testAddComputerNull() {
        List<Computer> computers = new ArrayList<>();
        this.computer1.addComputer(null);
    }
    @Test(expected= IllegalArgumentException.class)
    public void testAddComputer() {
        List<Computer> computers = new ArrayList<>();
        this.computer1.addComputer(computer);
        this.computer1.addComputer(computer);
    }
}