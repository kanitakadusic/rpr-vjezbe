package ba.unsa.etf.rpr;

public class Winner {
    private final String name, surname;
    private final int numOfChars;

    public Winner(FullName fullName) {
        String longest = fullName.getLongestFullName();

        name = longest.substring(0, longest.indexOf(' '));
        surname = longest.substring(longest.indexOf(' ') + 1);
        numOfChars = name.length();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumOfChars() {
        return numOfChars;
    }
}
