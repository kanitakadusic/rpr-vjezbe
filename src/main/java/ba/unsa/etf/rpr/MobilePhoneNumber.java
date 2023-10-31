package ba.unsa.etf.rpr;

public class MobilePhoneNumber extends PhoneNumber {
    private int network;

    public MobilePhoneNumber(int network, String phoneNumber) {
        super(phoneNumber);
        this.network = network;
    }

    public int getNetwork() {
        return this.network;
    }

    public void setNetwork(int network) {
        this.network = network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePhoneNumber that)) return false;

        return this.getPhoneNumber().equals(that.getPhoneNumber()) && this.getNetwork() == that.getNetwork();
    }

    @Override
    public int hashCode() {
        return (this.getPhoneNumber() + this.getNetwork()).hashCode();
    }

    @Override
    public String toString() {
        return "0" + this.getNetwork() + "/" + this.getPhoneNumber();
    }
}
