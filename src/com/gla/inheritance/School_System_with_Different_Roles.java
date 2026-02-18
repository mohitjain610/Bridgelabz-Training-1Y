package com.gla.inheritance;

class Device {
    int deviceId;
    boolean status;

    void displayStatus() {
        System.out.println(deviceId + " " + status);
    }
}

class Thermostat extends Device {
    int temperature;

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temp: " + temperature);
    }
}
