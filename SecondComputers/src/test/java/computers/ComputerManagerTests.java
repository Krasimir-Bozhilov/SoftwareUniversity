package computers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ComputerManagerTests {
    // TODO: Test ComputerManager
    ComputerManager computerManager =new ComputerManager();
    Computer computer =new Computer("Dell","Inspirion",1200.00);
    Computer computer2 =new Computer("Asus","A505",1500.00);
    List<Computer>computers=new ArrayList<>();
    @Test
    public void testConstructor(){
        Assert.assertEquals(0,computers.size());
    }
    @Test
    public void testConstructor2(){
        computers.add(computer);
        computers.add(computer2);
        Assert.assertEquals("Dell",computers.get(0).getManufacturer());
        Assert.assertEquals("Inspirion",computers.get(0).getModel());
        Assert.assertEquals(1200,computers.get(0).getPrice(),0.0);
    }
    @Test
    public void testConstructor3(){
        computers.add(computer);
        computers.add(computer2);
        Assert.assertEquals("Asus",computers.get(1).getManufacturer());
        Assert.assertEquals("A505",computers.get(1).getModel());
        Assert.assertEquals(1500,computers.get(1).getPrice(),0.0);
    }
    @Test
    public void testGetComputers(){
        Assert.assertEquals(0,computerManager.getComputers().size());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddComputer(){
        computerManager.addComputer(null);
    }
    @Test(expected = IllegalArgumentException.class)
   public void testAddComputer2(){
        computerManager.addComputer(computer);
        computerManager.addComputer(computer);
    }
    @Test
   public void testAddComputer3(){
        computerManager.addComputer(computer);
        Assert.assertEquals(computer,computerManager.getComputers().get(0));
    }
    @Test
   public void testRemoveComputer(){
        computerManager.addComputer(computer);
        Assert.assertEquals(computer,computerManager.removeComputer("Dell","Inspirion"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void tesGetComputer(){
        computerManager.getComputer("Dell",null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void tesGetComputer2(){
        computerManager.getComputer(null,"Inspirion");
    }
    @Test(expected = IllegalArgumentException.class)
    public void tesGetComputer3(){
        computerManager.addComputer(computer);
        computerManager.getComputer("HP","Pavilion");
    }
    @Test
    public void tesGetComputer4(){
        computerManager.addComputer(computer);
        computerManager.addComputer(computer2);
        Computer returned =computerManager.getComputer("Dell","Inspirion");
        Assert.assertEquals(computer.getManufacturer(),returned.getManufacturer());
        Assert.assertEquals(computer.getModel(),returned.getModel());
    }
    @Test(expected = IllegalArgumentException.class)
    public void tesGetComputerByMan(){
        computerManager.getComputersByManufacturer(null);

    }
    @Test
    public void tesGetComputerByMan2(){
        computerManager.addComputer(computer);
       Assert.assertEquals("Dell", computerManager.getComputersByManufacturer("Dell").get(0).getManufacturer());

    }
    @Test
    public void testGetCount(){
        Assert.assertEquals(0,computerManager.getCount());
    }

}