package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";
    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute : " + instituteName);
        System.out.println("Course    : " + courseName);
        System.out.println("Duration  : " + duration + " months");
        System.out.println("Fee       : " + fee);
        System.out.println();
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("GLA University");
        System.out.println("After Updating Institute Name:\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
