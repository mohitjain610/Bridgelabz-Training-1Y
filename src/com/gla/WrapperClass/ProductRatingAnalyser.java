package com.gla.WrapperClass;

import java.util.*;

public class ProductRatingAnalyser {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(null);

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr1) list.add(x);

        for (Integer x : arr2) {
            if (Objects.nonNull(x)) list.add(x);
        }

        int sum = 0;
        for (int x : list) sum += x;

        System.out.println(sum / list.size());
    }
}
