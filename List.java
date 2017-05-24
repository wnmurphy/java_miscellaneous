/**
 * Each object of class List creates an array of integers of length
 * numInts and stores random numbers into the array.
 * Contains a constructor method List with integer parameter numInts
 * to set array length.
 */
import java.util.*; public class List {
  private int[] list;
  /**
   * Constructor method to make a List array of numInts length.
   */
  public List(int numInts) {
    list = new int[numInts];
  }
  /**
   * Stores random integers into each array element using a for loop
   * to set values throughout array.
   */
  public void fillWithRandom () {
    int arrayLength = list.length; Random r = new Random();
    for (int i = 0; i < arrayLength; i++) {
      list[i] = r.nextInt();
    } 
  }
  /**
   * Returns a string containing the value of each element in the array.
   */
  public String toString () {
    int arrayLength = list.length; String s = "";
    for (int i = 0; i < arrayLength; i++) {
      s = s + " " + list[i] + "\n"; return s;
    } 
  }
}
