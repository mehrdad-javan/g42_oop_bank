package se.lexicon;

public class Customer {

  private String name;
  private String email;
  private String phoneNUmber;

  public Customer() {
  }

  public Customer(String name, String email, String phoneNUmber) {
    this.name = name;
    this.email = email;
    this.phoneNUmber = phoneNUmber;
  }

  public String getCustomerInformation() {
    return "Customer Information =>  Name:" + name + ", Email: " + email + " Phone Number:" + phoneNUmber;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNUmber() {
    return phoneNUmber;
  }

  public void setPhoneNUmber(String phoneNUmber) {
    this.phoneNUmber = phoneNUmber;
  }
}
