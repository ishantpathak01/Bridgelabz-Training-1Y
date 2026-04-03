package com.gla.WrapperClass;

public class BankLimit {

    public static double getRemainingLimit(Double limit, double withdrawn) {
        if (limit == null) {
            return 0.0;
        }
        return limit - withdrawn;
    }

    public static void main(String[] args) {

        System.out.println(getRemainingLimit(5000.0, 1500.0));
        System.out.println(getRemainingLimit(null, 1000.0));
    }
}
