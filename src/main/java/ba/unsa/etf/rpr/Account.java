package ba.unsa.etf.rpr;

public class Account {
    private long accountNumber;
    private Person user;
    private boolean overdraftApproved;
    private double balance;

    Account(long accountNumber, Person user) {
        this.accountNumber = accountNumber;
        this.user = user;
    }

    public boolean isOverdraftApproved() {
        return this.overdraftApproved;
    }
}
