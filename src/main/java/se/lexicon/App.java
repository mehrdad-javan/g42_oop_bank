package se.lexicon;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Customer customer1 = new Customer("Mehrdad Javan", "mehrdad.javan@lexicon.se", "123456789");
    BankAccount account1 = new BankAccount(customer1);
    System.out.println(account1.getAccountNumber());

    System.out.println(account1.getBalance());
    account1.deposit(100);
    System.out.println(account1.getBalance());
    account1.withdraw(50);
    System.out.println(account1.getBalance());
    System.out.println(account1.getCustomer().getCustomerInformation());



    Customer customer2 = new Customer("Test Test", "test.tes@lexicon.se", "99999999");
    BankAccount account2 = new BankAccount(customer2);
    System.out.println(account2.getAccountNumber());



    Customer customer3 = new Customer("Test Test", "test.tes@lexicon.se", "99999999");
    BankAccount account3 = new BankAccount(customer3);
    System.out.println(account3.getAccountNumber());

  }
}
