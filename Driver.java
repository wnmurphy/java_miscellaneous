/**
 * Defines a reusable class Driver.
 * One object of class Driver uses numerical console input from user
 * to calculate an insurance premium using conditional functions.
 */
import java.util.Scanner; 

public class Driver {
  private double tempPremium; 
  private int age;
  private int tickets; 
  private int carValue;
  /**
  * Prompts user for ints to store in age, tickets, and carValue. */
  public void read () {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Please enter your age:");
    age = scanner.nextInt();
    System.out.println("Please enter the number of tickets you have:"); 
    tickets = scanner.nextInt();
    System.out.println("Please enter the value of your car:"); 
    carValue = scanner.nextInt();
  }
       /**
        *  Calculates the premium and returns result.
        */
  public double premium () {
    if(age < 25) {
      tempPremium = (carValue * 0.05) * 1.15; 
    } else {
      if(age < 30) {
        tempPremium = (carValue * 0.05) * 1.10;
      }
    } else { 
      tempPremium = carValue * 0.05;
    }
  }

  switch (tickets) { 
    case 0:
      break; 
    case 1:
      tempPremium = tempPremium * 1.1;
      break; 
    case 2:
      tempPremium = tempPremium * 1.25;
      break; 
    case 3:
      tempPremium = tempPremium * 1.5;
      break; 
    default:
      tempPremium = tempPremium * 0;
  }
  return tempPremium; 
}