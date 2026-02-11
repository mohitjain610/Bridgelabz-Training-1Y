package com.gla.string.problem_statement;

import java.util.Scanner;
public class CountVC{
    public static void count(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }else{
                    c++;
                }
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        count(s);
    }
}
