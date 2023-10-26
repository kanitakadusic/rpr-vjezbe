package ba.unsa.etf.rpr;

public class User extends Person {
    private final int userId;
    private static int id;

    Account account;

    User(String firstname, String lastname) {
        super(firstname, lastname);
        this.userId = ++id;
        this.account = new Account();
    }

    public int getUserId() { return this.userId; }

    public Account getAccount() { return this.account; }
}
