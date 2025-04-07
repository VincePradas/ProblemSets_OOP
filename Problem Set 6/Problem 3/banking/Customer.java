package banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private SavingsAccount SA = null;
    private CheckingAccount CA = null;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Account getAccount() {
        return this.account;
    }

    public Account setAccount(Account acct) {
        this.account = acct;
        return this.account;
    }

    public SavingsAccount getSavings() {
        return this.SA;
    }

    public CheckingAccount getChecking() {
        return this.CA;
    }

    public void setSavings(SavingsAccount sa) {
        this.SA = sa;
    }

    public void setChecking(CheckingAccount ca) {
        this.CA = ca;
    }
}
