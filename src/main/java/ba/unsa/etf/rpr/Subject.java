package ba.unsa.etf.rpr;

public class Subject implements Printable {
    private String name, description;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " " + getDescription());
    }
}
