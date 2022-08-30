package org.example;

public class Employee implements IEmployee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String department;

    // Please implement necessary methods to get and set these attributes of
    // employee
    // All methods should only print the name of the employee (Manager or SoftDev)
    // and the name of the method.

    public Employee(int Id, String FirstName, String LastName, int Age, double Salary, String Department) {
        this.id = Id;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.salary = Salary;
        this.department = Department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

}
