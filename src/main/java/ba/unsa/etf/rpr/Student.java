package ba.unsa.etf.rpr;

public class Student extends Pearson {
    private int year;
    private String index;

    public Student(String name, String surname, int year, String index) {
        super(name, surname);
        this.year = year;
        this.index = index;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
