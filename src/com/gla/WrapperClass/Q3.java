package com.gla.WrapperClass;

import java.util.ArrayList;

public class Q3 {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum=0;
        for(int x:list){
            sum+=x;
        }
        System.out.println(sum);
    }
}
