package com.gla.generic;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    class Vehicle {}
    class Truck extends Vehicle {}
    class Bike extends Vehicle {}

    class FleetManager<T extends Vehicle> {
        List<T> vehicles = new ArrayList<>();

        void addVehicle(T v) {
            vehicles.add(v);
        }

        void showFleet() {
            System.out.println(vehicles);
        }
    }
}
