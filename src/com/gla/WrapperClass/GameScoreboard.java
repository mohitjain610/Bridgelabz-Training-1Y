package com.gla.WrapperClass;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 20, null, 30};

        int count = 0;
        int sum = 0;

        for (Integer x : scores) {
            if (x == null) count++;
            else sum += x;
        }

        System.out.println(count);
        System.out.println(sum);
    }
}