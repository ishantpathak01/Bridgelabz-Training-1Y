package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Student {
    public int rollNumber;     
    protected String name;     
  private double CGPA;       

    Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
}
class PostgraduateStudent extends Student {
    String specialization;
    PostgraduateStudent(int roll, String name, double cgpa, String specialization) {
        super(roll, name, cgpa);
        this.specialization = specialization;
    }
    void displayDetails() {
        System.out.println("Roll No       : " + rollNumber); 
        System.out.println("Name          : " + name);       
        System.out.println("CGPA          : " + getCGPA());  
        System.out.println("Specialization: " + specialization);
    }
}
public class Main {
    public static void main(String[] args) {
        PostgraduateStudent pg =
                new PostgraduateStudent(101, "Ishant", 8.5, "Computer Science");
        pg.displayDetails();
        pg.setCGPA(9.0);

        System.out.println("\nUpdated CGPA: " + pg.getCGPA());
    }
}
