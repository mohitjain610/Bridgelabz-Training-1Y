package com.gla.inheritance;

class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Gear: " + hasGear);
    }
}

