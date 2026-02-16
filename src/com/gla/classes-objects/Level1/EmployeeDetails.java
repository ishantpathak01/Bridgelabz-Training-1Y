package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ishant", 101, 25000);

        emp1.displayDetails();
    }
}
