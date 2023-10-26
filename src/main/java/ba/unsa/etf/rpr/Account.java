package ba.unsa.etf.rpr;

public class Account {
    private final int accountId;
    private static int id;

    private double balance;
    private double overdraft;

    Account() {
        this.accountId = ++id;
        this.balance = 0;
        this.overdraft = -1; // default value for prohibited overdraft
    }

    public int getAccountId() { return this.accountId; }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        this.balance += amount; return true;
    }

    public boolean withdrawal(double amount) {
        if (amount < 0 || this.balance - amount < (this.overdraft == -1 ? 0 : -this.overdraft)) return false;
        this.balance -= amount; return true;
    }

    public double getBalance() { return this.balance; }

    public boolean approveOverdraft(double amount) {
        if (amount < 0) return false;
        this.overdraft = amount; return true;
    }

    public boolean prohibitOverdraft() {
        if (this.balance < 0) return false;
        this.overdraft = -1; return true;
    }

    public boolean overdraftApproved() { return this.overdraft >= 0; }
}
