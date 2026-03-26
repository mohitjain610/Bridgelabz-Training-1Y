package com.gla;

public class ThirdThread implements Runnable{
    @Override
    public void run() {
        for (int i = 97; i <107 ; i++) {
            System.out.println((char)i);
            try{
                Thread.sleep(2000);}
            catch (InterruptedException e) {
                System.out.println("handel");
            }
        }

    }
}
