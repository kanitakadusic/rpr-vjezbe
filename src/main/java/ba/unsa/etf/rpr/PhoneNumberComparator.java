package ba.unsa.etf.rpr;

import java.util.Comparator;

public class PhoneNumberComparator implements Comparator<PhoneNumber> {
    public int compare(PhoneNumber first, PhoneNumber second) {
        return first.toString().compareTo(second.toString());
    }
}
