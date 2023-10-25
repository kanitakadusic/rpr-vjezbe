package ba.unsa.etf.rpr;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<Employee> employees;
    private List<User> users;

    Bank() {
        this.employees = new LinkedList<Employee>();
        this.users = new LinkedList<User>();
    }

    public Employee addNewEmployee(String firstname, String lastname) {
        Employee newEmployee = new Employee(firstname, lastname);
        employees.add(newEmployee);
        return newEmployee;
    }

    public User addNewUser(String firstname, String lastname) {
        User newUser = new User(firstname, lastname);
        users.add(newUser);
        return newUser;
    }
}
