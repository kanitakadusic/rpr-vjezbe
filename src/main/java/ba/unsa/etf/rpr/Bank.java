package ba.unsa.etf.rpr;

import java.util.LinkedList;

public class Bank {
    private LinkedList<Employee> employees;
    private LinkedList<User> users;

    Bank() {
        this.employees = new LinkedList<>();
        this.users = new LinkedList<>();
    }

    public Employee addEmployee(String firstname, String lastname) {
        Employee newEmployee = new Employee(firstname, lastname);
        this.employees.add(newEmployee);
        return newEmployee;
    }

    public void removeEmployee(int employeeId) {
        this.employees.removeIf(object -> object.getEmployeeId() == employeeId);
    }

    public Employee getEmployee(int employeeId) throws NoSuchFieldException {
        for (Employee employee : this.employees)
            if (employee.getEmployeeId() == employeeId)
                return employee;

        throw new NoSuchFieldException();
    }

    public User addUser(String firstname, String lastname) {
        User newUser = new User(firstname, lastname);
        this.users.add(newUser);
        return newUser;
    }

    public void removeUser(int userId) {
        this.users.removeIf(object -> object.getUserId() == userId);
    }

    public User getUser(int userId) throws NoSuchFieldException {
        for (User user : this.users)
            if (user.getUserId() == userId)
                return user;

        throw new NoSuchFieldException();
    }

    public LinkedList<Employee> getEmployees() { return this.employees; }

    public LinkedList<User> getUsers() { return this.users; }
}
