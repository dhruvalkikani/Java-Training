package com.masai.entity;

public class Employee {

    private String name ;
    private String role;
    private int salary;

    public Employee(int salary, String role, String name) {
        this.salary = salary;
        this.role = role;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
