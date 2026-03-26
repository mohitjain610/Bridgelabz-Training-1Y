package com.gla;

public class multitreading {
    static void main() {
        System.out.println("main start");
        MyThread mt =new MyThread();
        OtherThread ot =new OtherThread();

        mt.start();
        ot.start();
        Thread tt=new Thread(new ThirdThread());
        tt.start();
        System.out.println("main end");

    }

}

