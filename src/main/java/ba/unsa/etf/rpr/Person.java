package ba.unsa.etf.rpr;

public class Person {
    private String firstname, lastname;

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() { return this.firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return this.lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    @Override
    public String toString() { return this.firstname + " " + this.lastname; }
}
