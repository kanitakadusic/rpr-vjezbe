package ba.unsa.etf.rpr;

public class Employee extends Person {
    private final int employeeId;
    private static int id;

    Employee(String firstname, String lastname) {
        super(firstname, lastname);
        this.employeeId = ++id;
    }

    public int getEmployeeId() { return this.employeeId; }
}
