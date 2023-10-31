package ba.unsa.etf.rpr;

public class LocalPhoneNumber extends PhoneNumber {
    private City city;

    public LocalPhoneNumber(City city, String phoneNumber) {
        super(phoneNumber);
        this.city = city;
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.getCity().getCode() + "/" + this.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}
