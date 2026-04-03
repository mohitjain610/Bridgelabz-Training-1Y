package com.gla.WrapperClass;

import java.util.ArrayList;

public class Q7 {
    static void main() {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list=new ArrayList<>();
        for(double x:prices){
            list.add(x);
        }
        double sum=0,max=0;
        for(double x:prices){
            sum+=x;
            if(x>max)max=x;
        }
        System.out.println(max);
        System.out.println(sum/ list.size());
    }
}
