package banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    @Override
    public boolean withdraw(double amt) {
        //check balance
        if (super.balance >= amt) {
            return super.withdraw(amt);
        } else {
            //check pila ang kuwang
            double Short = amt - super.balance;
            
            //e cover gamit and overdraftprotection
            if (Short <= overdraftProtection) {
                //withdraw full balance + overdraftprotection
                overdraftProtection -= Short;
                super.withdraw(super.balance);
                return true;
            } else {
                return false;
            }
        }
    }
}
