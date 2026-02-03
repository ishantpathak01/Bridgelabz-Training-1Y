import java.util.Scanner;
public class OddEvenSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
       int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Enter a number greater than 0.");
            return;
        }
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nEven numbers:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
