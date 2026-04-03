package com.gla.WrapperClass;

public class Bank {

    public static double getRemaining(Double limit, double used) {
        if (limit == null) return 0.0;
        return limit - used;
    }

    public static void main(String[] args) {
        System.out.println(getRemaining(5000.0, 2000.0));
        System.out.println(getRemaining(null, 2000.0));
    }
}
