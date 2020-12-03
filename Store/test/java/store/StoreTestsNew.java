package store;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class StoreTests {
    Product product;
    List<Product>size;
    final String name = "Hello";
    final int quantity = 2;
    final double price = 2.02;
   @Before
   public void createProduct() {


      product = new Product(name, quantity, price);
       size = new ArrayList<Product>();
   }
   @Test
   public void testStore() {

      Product product = new Product(name, quantity, price);
      Assert.assertEquals("Hello", product.getName());
      Assert.assertEquals(2, product.getQuantity());
      Assert.assertEquals(2.02, product.getPrice(),0);

   }
  @Test
   public void getCountTest(){

     size.add(product);

     Assert.assertEquals(1,size.size());

  }
}
//   @Test
//   public void checkIfListIsImmutable(){
//
//}