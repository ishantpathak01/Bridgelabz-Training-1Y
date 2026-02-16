package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Employee {
    public int employeeID;       
    protected String department;  
    private double salary;        
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}
