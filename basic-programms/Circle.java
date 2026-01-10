import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14159 * radius * radius;
        System.out.println("Area of the circle: " + area);
        sc.close();
    }
}
