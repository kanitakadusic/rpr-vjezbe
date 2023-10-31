package ba.unsa.etf.rpr;

public class InternationalPhoneNumber extends PhoneNumber {
    private String state;

    public InternationalPhoneNumber(String state, String phoneNumber) {
        super(phoneNumber);
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternationalPhoneNumber that)) return false;

        return this.getPhoneNumber().equals(that.getPhoneNumber()) && this.getState().equals(that.getState());
    }

    @Override
    public int hashCode() {
        return (this.getPhoneNumber() + this.getState()).hashCode();
    }

    @Override
    public String toString() {
        return this.getState() + ".." + this.getPhoneNumber();
    }
}
