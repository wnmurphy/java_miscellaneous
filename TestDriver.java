/**
 * Tests class Driver by reading the data, calculating, and printing
 * the insurance premiums for four different drivers.
 */
import java.text.DecimalFormat; 

class TestDriver {
  public static void main(String args[]) { 
    Driver driver;
    driver = new Driver();
    
    DecimalFormat df = new DecimalFormat("0.00"); //Round the premium to 2 decimal places.
    
    driver.read();
    System.out.println("Premium: $" + df.format(driver.premium())); driver.read();
    System.out.println("Premium: $" + df.format(driver.premium())); driver.read();
    System.out.println("Premium: $" + df.format(driver.premium())); driver.read();
    System.out.println("Premium: $" + df.format(driver.premium()));
  } 
}