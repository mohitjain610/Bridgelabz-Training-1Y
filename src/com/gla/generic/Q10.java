package com.gla.generic;

import java.util.List;

public class Q10 {
    class Product {
        double price;

        double getPrice() {
            return price;
        }
    }

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
