package ba.unsa.etf.rpr;

abstract public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    abstract public boolean equals(Object o);

    @Override
    abstract public int hashCode();

    @Override
    abstract public String toString();
}
