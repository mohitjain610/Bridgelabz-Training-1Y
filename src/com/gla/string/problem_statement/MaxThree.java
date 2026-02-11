package com.gla.string.problem_statement;

import java.util.Scanner;
public class MaxThree{
    public static int max(int a,int b,int c){
        int m=a;
        if(b>m){
            m=b;
        }
        if(c>m){
            m=c;
        }
        return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(max(a,b,c));
    }
}
