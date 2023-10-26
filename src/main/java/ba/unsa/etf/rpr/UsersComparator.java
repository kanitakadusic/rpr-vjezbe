package ba.unsa.etf.rpr;

import java.util.Comparator;

public class UsersComparator implements Comparator<User> {
    public int compare(User first, User second) {
        return Long.compare(second.getAccount().getAccountId(), first.getAccount().getAccountId());
    }
}
