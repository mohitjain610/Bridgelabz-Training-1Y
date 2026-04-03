package com.gla.WrapperClass;

public class Q6 {
    public static int safeParseInt(String input){
        try{
            return Integer.parseInt(input);
        } catch (Exception e) {
            return -1;
        }
    }
    static void main() {
        System.out.println(safeParseInt("123"));
        System.out.println(safeParseInt("abc"));
        System.out.println(safeParseInt("45.67"));
        System.out.println(safeParseInt("0"));
    }
}
