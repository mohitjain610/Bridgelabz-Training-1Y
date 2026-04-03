package com.gla.WrapperClass;

public class StudentMarks {
    public static void main(String[] args) {
        String[] marks = {"85", "null", "90", "abc"};

        int sum = 0, count = 0;

        for (String x : marks) {
            try {
                if (!x.equals("null")) {
                    sum += Integer.parseInt(x);
                    count++;
                }
            } catch (Exception e) {
            }
        }

        System.out.println(sum / count);
    }
}
