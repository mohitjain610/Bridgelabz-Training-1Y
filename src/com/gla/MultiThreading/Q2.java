package com.gla.MultiThreading;

class Device implements Runnable {
    String name;
    int time;

    public Device(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " working cycle " + i);
            try {
                Thread.sleep(time);
            } catch (Exception e) {
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Device("Security Camera", 3000));
        Thread t2 = new Thread(new Device("Temperature Sensor", 5000));
        Thread t3 = new Thread(new Device("Light Controller", 4000));
        Thread t4 = new Thread(new Device("Door Lock", 6000));

        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}