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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalPhoneNumber that)) return false;

        return this.getPhoneNumber().equals(that.getPhoneNumber()) && this.getCity() == that.getCity();
    }

    @Override
    public int hashCode() {
        return (this.getPhoneNumber() + this.getCity()).hashCode();
    }

    @Override
    public String toString() {
        return this.getCity().getCode() + "/" + this.getPhoneNumber();
    }
}
