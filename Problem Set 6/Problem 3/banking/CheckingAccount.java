package banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;
    private SavingsAccount protectedBy = null;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance, SavingsAccount protect) {
        super(balance);
        this.protectedBy = protect;
    }

    @Override
    public boolean withdraw(double amt) {
        if (super.balance >= amt) {
            return super.withdraw(amt);
        } else {

            double Short = amt - super.balance;

            //Protection handler gamit ang savings acc
            if (protectedBy != null) {
                if (protectedBy.withdraw(Short)) { //try pag wd sa Savings Acc
                    super.withdraw(super.balance); //proceed
                    return true;
                } else {
                    return false;
                }
            } else if (Short <= overdraftProtection) {
                overdraftProtection -= Short;
                super.withdraw(super.balance);
                return true;
            } else {
                return false;
            }
        }
    }
}
