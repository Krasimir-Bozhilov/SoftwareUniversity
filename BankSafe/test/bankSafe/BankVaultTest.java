package bankSafe;


import org.junit.Assert;
import org.junit.Test;

public class BankVaultTest {
    BankVault bankVault =new BankVault();

    @Test
    public void testGetVaul(){
        Assert.assertEquals(0,bankVault.getVaultCells().size());
    }

}