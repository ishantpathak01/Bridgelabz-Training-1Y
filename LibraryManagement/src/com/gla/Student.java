package com.gla;

public class Student extends Person {

    private int rollNumber;
    private int year;
    private Branch branch;
    public Student() {}
    public Student(int id, String name, String mail, int rollNumber, int year, Branch branch) {
        super(id, name, mail);
        this.rollNumber = rollNumber;
        this.year = year;
        this.branch = branch;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            System.out.println("Invalid Roll Number!");
        } else {
            this.rollNumber = rollNumber;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 5) {
            System.out.println("Year must be between 1 and 5!");
        } else {
            this.year = year;
        }
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        if (branch == null) {
            System.out.println("Branch cannot be null!");
        } else {
            this.branch = branch;
        }
    }

    // 🔹 Display
    @Override
    public String toString() {
        return super.toString() +
                ", Roll No: " + rollNumber +
                ", Year: " + year +
                ", Branch: " + branch;
    }
}