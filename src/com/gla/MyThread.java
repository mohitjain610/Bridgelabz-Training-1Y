package com.gla;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <11; i++) {
            System.out.println(i);
        }
    }
}
