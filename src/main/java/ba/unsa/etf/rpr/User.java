package ba.unsa.etf.rpr;

public class User extends Person {
    private Account account;

    User(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; }
}
