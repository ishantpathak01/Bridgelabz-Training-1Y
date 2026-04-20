import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }

        sc.close();
    }
}
