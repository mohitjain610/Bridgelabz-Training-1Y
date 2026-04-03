package com.gla.WrapperClass;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] arr = {"250", "499", "abc", "99"};

        int total = 0;

        for (String x : arr) {
            try {
                total += Integer.parseInt(x);
            } catch (Exception e) {
            }
        }

        System.out.println(total);
    }
}