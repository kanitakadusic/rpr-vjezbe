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
    public String toString() {
        return "0" + this.getNetwork() + "/" + this.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return Integer.toString(this.network).hashCode();
    }
}
