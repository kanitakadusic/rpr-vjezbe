package ba.unsa.etf.rpr;

public class Teacher extends Pearson {
    private String title;

    public Teacher(String name, String surname, String title) {
        super(name, surname);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
