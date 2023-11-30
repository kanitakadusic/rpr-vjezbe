package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class FullName {
    private ArrayList<String> fullNames;

    public ArrayList<String> getFullNames() {
        return fullNames;
    }

    public void setFullNames(ArrayList<String> fullNames) {
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
