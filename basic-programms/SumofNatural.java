import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            int sum = numb * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + num + " is not a natural number");
        }
        sc.close();
    }
}
