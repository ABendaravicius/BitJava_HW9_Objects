package com.arnas.hw9.arr;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private int salary;

    public Employee(String n, String ln, String pos, int pay) {
        this.name = n;
        this.lastName = ln;
        this.position = pos;
        this.salary = pay;
    }

    // ... Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    // ... Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("That is not a valid salary value.");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return name + " " + lastName + ", " + position + ". $alary: " + salary;
    }
}
