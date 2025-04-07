package banking;
import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    List<Account> accounts;
    private int numOfAccounts;
    
    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Account getCustomer(int idx) {
        return this.accounts.get(idx);
    }

    public void addAccount(Account acct) {
        this.accounts.add(acct);
        this.numOfAccounts++;
    }

    public Account getAccount(int idx) {
        return this.accounts.get(idx);
    }

    public int getNumOfAccounts() {
        return this.numOfAccounts;
    }
}
