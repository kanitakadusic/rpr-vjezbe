package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class NameSurname implements MyCollection {
    private final ArrayList<String> names, surnames;

    public NameSurname(ArrayList<String> names, ArrayList<String> surnames) {
        this.names = names;
        this.surnames = surnames;
    }

    public int getIndexOfLongestPair() {
        if (names.isEmpty() || names.size() != surnames.size()) return -1;

        int max = 0;
        for (int i = 1; i < names.size(); i++) {
            if (names.get(i).concat(surnames.get(i)).length() > names.get(max).concat(surnames.get(max)).length()) {
                max = i;
            }
        }

        return max;
    }

    public String getNameSurname(int index) {
        if (index < 0 || index >= names.size() || names.size() != surnames.size()) return null;
        return names.get(index) + " " + surnames.get(index);
    }
}
