package com.gla;
public class Admin extends Person {
    private String department;
    public Admin() {}
    public Admin(int id, String name, String mail, String department) {
        super(id, name, mail);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("Department cannot be empty!");
        } else {
            this.department = department;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}