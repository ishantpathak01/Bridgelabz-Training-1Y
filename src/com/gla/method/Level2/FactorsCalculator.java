package com.gla.method.Level1;

import java.util.Scanner;

public class FactorsCalculator {

    public static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] a = new int[c];
        for (int i = 1, j = 0; i <= n; i++)
            if (n % i == 0) a[j++] = i;
        return a;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    public static long product(int[] a) {
        long p = 1;
        for (int x : a) p *= x;
        return p;
    }

    public static double sumSquare(int[] a) {
        double s = 0;
        for (int x : a) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = factors(n);

        for (int x : f) System.out.print(x + " ");
        System.out.println("\nSum = " + sum(f));
        System.out.println("Product = " + product(f));
        System.out.println("SumSquares = " + sumSquare(f));
    }
}
