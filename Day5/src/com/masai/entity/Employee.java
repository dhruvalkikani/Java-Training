package com.masai.entity;

import java.util.Objects;

public class Employee implements Comparable{

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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, salary);
    }

    @Override
    public int compareTo(Object o) {
        Employee EMP = (Employee) o;
        if (this.salary > EMP.salary)
            return 1;
        else if(this.salary < EMP.salary)
            return -1;
        else {
            return 0;
        }
    }
}
