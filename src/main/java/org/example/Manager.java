package org.example;

public class Manager extends Employee implements IManager {

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    private int numberOfEmployeesSupervised;

    public Manager(int Id, String FirstName, String LastName, int Age, double Salary, String Department) {
        super(Id, FirstName, LastName, Age, Salary, Department);
    }

    public void setNumberOfEmployeesSupervised(int numberOfEmployeesSupervised) {
            this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }