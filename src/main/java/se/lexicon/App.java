package se.lexicon;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Customer customer1 = new Customer("Mehrdad Javan", "mehrdad.javan@lexicon.se", "123456789");
    BankAccount account1 = new BankAccount(1, customer1);
    System.out.println(account1.getBalance());
    account1.deposit(100);
    System.out.println(account1.getBalance());
    account1.withdraw(50);
    System.out.println(account1.getBalance());
    System.out.println(account1.getCustomer().getCustomerInformation());

  }
}
