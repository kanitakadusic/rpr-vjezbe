package ba.unsa.etf.rpr;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employee> {
    public int compare(Employee first, Employee second) {
        return second.toString().toLowerCase().compareTo(first.toString().toLowerCase());
    }
}
