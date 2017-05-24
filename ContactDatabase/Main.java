import java.util.Scanner; import java.io.*;
/**
 * Accepts user input, sends user input to other classes, and calls methods in
 * other classes based on user input.
 */
public class Main {
  static Scanner console = new Scanner(System.in); 
  static ContactArray arrayList = new ContactArray();
  public static void main(String[] args) { 
    int userChoice = 0;
    String search = ""; 
    arrayList.readFromDisk(); 
    while (userChoice != 6) {
      displayMainMenu(); // display Main Menu 
      /**
       * Uses switch to handles cases based on user input.
       */
      userChoice = console.nextInt(); switch (userChoice) {
        case 1:
          // enter new contact
          addContact();
          break; 
        case 2:
          // print contact list
          arrayList.sort(); 
          System.out.println(arrayList.toString()); 
          break;
        case 3:
          // search by last name
          System.out.println("Please enter a last name."); 
          search = console.nextLine();
          search = console.nextLine(); 
          System.out.println(arrayList.searchByLast(search)); 
          break;
        case 4:
          // search by email
          System.out.println("Please enter an email address."); 
          search = console.nextLine();
          search = console.nextLine(); 
          System.out.println(arrayList.searchByEmail(search)); 
          break;
        case 5:
          // search by ZIP
          System.out.println("Please enter a zip code."); 
          search = console.nextLine();
          search = console.nextLine(); 
          System.out.println(arrayList.searchByZip(search)); 
          break;
      } 
    }
    // save to disk and quit
    arrayList.saveToDisk();
    System.out.println("Quitting program."); 
  }

  public static void addContact() { 
    Contact tempContact;
    console.nextLine(); 
    String tempFirstName; 
    String tempLastName; 
    String tempHouseNumber; 
    String tempStreetName; 
    String tempCity;
    String tempState;
    String tempZip;
    String tempPhone;
    String tempEmail;
    String tempNotes;

    tempContact = new Contact("default"); 
    System.out.println("Enter first name:"); 
    tempFirstName = console.nextLine();
    if (!tempFirstName.isEmpty()) {
      tempContact.setFirstName(tempFirstName);
    }

    System.out.println("Enter last name:[Cannot be blank]"); 
    tempLastName = console.nextLine();
    while (tempLastName.isEmpty()) {
      System.out.println("Cannot be blank!"); 
      System.out.println("Enter a last name:"); 
      tempLastName = console.nextLine();
    }
    tempContact.setLastName(tempLastName);

    System.out.println("Enter house number:"); 
    tempHouseNumber = console.nextLine();
    if (!tempHouseNumber.isEmpty()) {
      tempContact.setHouseNumber(tempHouseNumber);
    }

    System.out.println("Enter street name:");
    tempStreetName = console.nextLine();
    if (!tempStreetName.isEmpty()) {
      tempContact.setStreetName(tempStreetName);
    }

    System.out.println("Enter city:");
    tempCity = console.nextLine();
    if (!tempCity.isEmpty()) {
      tempContact.setCity(tempCity);
    }

    System.out.println("Enter state:");
    tempState = console.nextLine();
    if (!tempState.isEmpty()) {
      tempContact.setState(tempState);
    }

    System.out.println("Enter zip:");
    tempZip = console.nextLine();
    if (!tempZip.isEmpty()) {
      tempContact.setZip(tempZip);
    }

    System.out.println("Enter phone number:");
    tempPhone = console.nextLine();
    if (!tempPhone.isEmpty()) {
      tempContact.setPhone(tempPhone);
    }

    System.out.println("Enter email address:");
    tempEmail = console.nextLine();
    if (!tempEmail.isEmpty()) {
      tempContact.setEmail(tempEmail);
    }

    System.out.println("Enter notes:");
    tempNotes = console.nextLine();
    if (!tempNotes.isEmpty()) {
      tempContact.setNotes(tempNotes);
    }

    arrayList.newContact(tempContact); 
  }

  /**
    * Displays the Main Menu
    */
  public static void displayMainMenu() { 
    System.out.println("****************************************");
    System.out.println(" Enter the number of an option below:");
    System.out.println("****************************************");
    System.out.println("\t1. Enter new contact");
    System.out.println("\t2. Print contact list");
    System.out.println("\t3. Search records by last name");
    System.out.println("\t4. Search records by email address");
    System.out.println("\t5. Search records by zip code");
    System.out.println("\t6. Save to file and quit");
    System.out.println("****************************************");
  } 
}