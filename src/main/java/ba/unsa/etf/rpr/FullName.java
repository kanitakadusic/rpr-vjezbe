package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class FullName implements MyCollection {
    private final ArrayList<String> fullNames;

    public FullName(ArrayList<String> fullNames) {
        this.fullNames = fullNames;
    }

    public String getLongestFullName() {
        if (fullNames.isEmpty()) return null;

        String max = fullNames.get(0);
        for (String s : fullNames) {
            if (s.length() > max.length()) {
                max = s;
            }
        }

        return max;
    }
}
