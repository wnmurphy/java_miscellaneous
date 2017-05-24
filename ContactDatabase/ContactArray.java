import java.util.ArrayList; 
import java.util.Collections; 
import java.io.*;
/**
 * One object of this class stores Contact objects in an array, reads from and
 * saves to disk, and handles uses cases: create new contact, print all
 * contacts, search by last name, search by email, search by zip.
 */
public class ContactArray {
  private ArrayList<Contact> contactList = new ArrayList<Contact>(0);
  /**
   * Creates a new Contact object inside our array.
   */
  public void newContact(Contact newContact) { 
    contactList.ensureCapacity(1); 
    contactList.add(newContact);
  }
  /**
   * Returns a single string containing all of the Contact objects in the
   * array.
   */
  public String toString() {
    if (contactList.isEmpty()) {
      return "No contacts Created.\n"; 
    }
    String s = "";
    for (int i = 0; i < contactList.size(); i++) {
      s += contactList.get(i).toString() + "\n";
    }
    return s; 
  }
  /**
   * Searches by last name as entered by user and returns the result as a
   * string.
   */
  public String searchByLast(String lastName) { 
    String s = "";
    for (int i = 0; i < contactList.size(); i++) {
      if (lastName.equals(contactList.get(i).getLastName())) {
        s += contactList.get(i).toString() + "\n";
      }
    }
    if (s.isEmpty()) {
      s = "No contacts found";
    }
    return s;
  }
  /**
   * Searches the array by email as entered by user and returns the result as
   * a string.
   */
  public String searchByEmail(String email) { 
    String s = "";
    for (int i = 0; i < contactList.size(); i++) {
      if (email.equals(contactList.get(i).getEmail())) {
        s += contactList.get(i).toString() + "\n";
      }
    }
    if (s.isEmpty()) {
      s = "No contacts found";
    }
    return s; 
  }
  /**
   * Searches the array by zip code as entered by user and returns the result
   * as a string.
   */
  public String searchByZip(String zip) { 
    String s = "";
    for (int i = 0; i < contactList.size(); i++) {
      if (zip.equals(contactList.get(i).getZip())) {
        s += contactList.get(i).toString() + "\n";
      }
    }
    if (s.isEmpty()) {
      s = "No contacts found";
    }
    return s; 
  }
  /**
   * Reads from disk and assigns to contactList
   */
  public void readFromDisk() {
    FileInputStream inFile;
    ObjectInputStream inObject;
    System.out.println("Reading from disk.");
    try {
      inFile = new FileInputStream("data");
      inObject = new ObjectInputStream(inFile);
      contactList = (ArrayList) inObject.readObject();
      inFile.close();
      inObject.close();
    } catch (IOException ioe) {
      System.out.println("Error reading from the file: " + ioe.getMessage());
    } catch (ClassNotFoundException cnfe) {
      System.out.println("Error in casting to contactList: " + cnfe);
    } 
  }
  /**
   * Saves the array to disk
   */
  public void saveToDisk() {
    FileOutputStream outFile;
    ObjectOutputStream outObject;
    System.out.println("Saving data to disk.");
    try {
      outFile = new FileOutputStream("data"); 
      outObject = new ObjectOutputStream(outFile); 
      outObject.writeObject(contactList); 
      outFile.close();
      outObject.close();
    } catch (IOException ioe) {
      System.out.println("Error writing objects to the file: " + ioe.getMessage());
    }
  }
  /**
   * Sorts the array by last name.
   */
  public void sort() { 
    Collections.sort(contactList);
  } 
}