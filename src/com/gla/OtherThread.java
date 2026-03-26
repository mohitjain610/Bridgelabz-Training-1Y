package com.gla;

public class OtherThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 65; i <75; i++) {
            System.out.println((char)i);

        }
    }
}
