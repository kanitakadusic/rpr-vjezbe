package ba.unsa.etf.rpr;

public class Pearson implements Printable {
    private String name, surname;

    public Pearson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getInfo() {
        return getName() + " " + getSurname();
    }
}
