package com.gla;

public class multitreading {
    static void main() {
        System.out.println("main start");
        MyThread mt =new MyThread();
        OtherThread ot =new OtherThread();
        mt.start();
        ot.start();
        System.out.println("main end");

    }

}

