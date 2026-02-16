package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Circle {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.setRadius(r);
        c.display();
    }
}
