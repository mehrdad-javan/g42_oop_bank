package se.lexicon;

public class BankAccount {

  private int accountNumber;
  private double balance;
  private Customer customer;

  public BankAccount(int accountNumber, Customer customer) {
    this.accountNumber = accountNumber;
    this.customer = customer;
  }

  public void deposit(double amount){
    if (amount < 0){
      // skip the application
      throw new IllegalArgumentException("Amount was negative");
    }

    balance = balance + amount;

  }

  public double withdraw(double amount){
    if (amount < 0){
      throw new IllegalArgumentException("Amount was negative");
    }
    if (amount > balance){
      // skip the application
      throw new IllegalArgumentException("amount is greater that the balance");
    }
    balance = balance - amount;

    return balance;

  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
