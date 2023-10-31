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
    public String toString() {
        return this.getState() + ".." + this.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return this.state.hashCode();
    }
}
