import java.io.Serializable;
/**
 * Defines a reusable class Contact. One object of class Contact uses
 * constructor to set default variables, stores values for contact's first name,
 * last name, street address, phone number, email, and notes.
 */
public class Contact implements Serializable, Comparable<Contact> {
  private String firstName;
  private String lastName;
  private String houseNumber;
  private String streetName; 
  private String city; 
  private String state; 
  private String zip; 
  private String phone; 
  private String email; 
  private String notes;

  /**
   * Constructor that sets default values to every field
   */
  public Contact(String newLastName) { 
    firstName = "n/a";
    lastName = newLastName;
    houseNumber = "n/a";
    streetName = "n/a";
    city = "n/a";
    state = "n/a";
    zip = "n/a";
    phone = "n/a";
    email = "n/a";
    notes = "n/a";
  }
  // Mutators
  /**
   * Sets the value for firstName to "newFirstName".
   */
  public void setFirstName(String newFirstName) { 
    firstName = newFirstName;
  }
  /**
   * Sets the value for lastNameName to "newLastName".
   */
  public void setLastName(String newLastName) { 
    lastName = newLastName;
  }
  /**
   * Sets the value for houseNumber to "newHouseNumber".
   */
  public void setHouseNumber(String newHouseNumber) { 
    houseNumber = newHouseNumber;
  }
  /**
   * Sets the value for streetName to "newStreetName".
   */
  public void setStreetName(String newStreetName) { 
    streetName = newStreetName;
  }
  /**
   * Sets the value for city to "newCity".
   */
  public void setCity(String newCity) { 
    city = newCity;
  }
  /**
   * Sets the value for state to "newState".
   */
  public void setState(String newState) { 
    state = newState;
  }
  /**
   * Sets the value for zip to "newZip".
   */
  public void setZip(String newZip) { 
    zip = newZip;
  }
  /**
   * Sets the value for phone to "newPhone".
   */
  public void setPhone(String newPhone) { 
    phone = newPhone;
  }
  /**
   * Sets the value for email to "newEmail".
   */
  public void setEmail(String newEmail) { 
    email = newEmail;
  }
  /**
   * Sets the value for notes to "newNotes".
   */
  public void setNotes(String newNotes) { 
    notes = newNotes;
  }
  // Getters
  /**
   * Returns the current value of firstName
   */
  public String getFirstName() { 
    return firstName;
  }
  /**
   * Returns the current value of lastName
   */
  public String getLastName() { 
    return lastName;
  }
  /**
   * Returns the current value of phone
   */
  public String getPhone() { 
    return phone;
  }
  /**
   * Returns the current value of email
   */
  public String getEmail() { 
    return email;
  }
  /**
   * Returns the current value of notes
   */
  public String getNotes() { 
    return notes;
  }
  /**
   * Returns the current value of zip
   */
  public String getZip() { 
    return zip;
  }
  /**
   * Compares the last name of two objects of class Contact
   * and returns either 1, 0, or ‐1 to be used for sorting.
   */
  public int compareTo (Contact otherContact) {
    for (int i = 0; i < this.getLastName().length() && i < otherContact.getLastName().length(); i++) {
      if ((int) this.getLastName().toUpperCase().charAt(i) < (int) otherContact.getLastName().toUpperCase().charAt(i)) { 
        return ‐1;
      } else if ((int) this.getLastName().toUpperCase().charAt(i) > (int) otherContact.getLastName().toUpperCase().charAt(i)) { 
        return 1;
      } 
    }
    return 0; 
  }

  /**
   * Concatenates the whole contact's address and returns it as a string.
   */
  public String streetAddressToString() {
    return houseNumber + " " + streetName + ", " + city + ", " + state + " " + zip;
  }
  /**
   * Concatenates and returns a string of the variables set to Contact object.
   */
  public String toString() { 
    String contact;
    contact = "Name: " + firstName + " " + lastName + "\n" + "Address: "
              + streetAddressToString() + "\n" + "Phone: " + phone + "\n"
              + "Email: " + email + "\n" + "Notes: " + notes + "\n";   
    return contact; 
  }
}