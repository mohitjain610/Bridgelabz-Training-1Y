package com.gla.WrapperClass;

import java.util.*;

public class Employee {
    public static void main(String[] args) {
        int[] ages = {20, 30, 25, 40};

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : ages) {
            list.add(x);
        }

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
