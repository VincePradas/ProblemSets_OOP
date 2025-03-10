package banking;
import java.util.*;

public class Bank {
    List<Customer> customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new ArrayList<>(5);
    }

    public void addCustomer(String f, String l) {
        this.customers.add(new Customer(f, l));
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customers.get(index);
    }
}
