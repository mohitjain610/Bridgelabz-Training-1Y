package com.gla.logistic_db_connection.src;

import java.util.*;




public class Main {
    public static void main(String[] args) throws Exception {

        // 🔷 DRIVER 1
        Driver d1 = new Driver("D106", "Amit Sharma");

        d1.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("D106_C1", "Warehouse A", 40, 50, 60));
        d1.routeHistory.addCheckpoint(
                new FuelCheckpoint("D106_C2", "Fuel Pump 1", 20, 30, 30));
        d1.routeHistory.addCheckpoint(
                new RestCheckpoint("D106_C3", "Rest Area X", 10, 20, 45));

        // 🔷 DRIVER 2
        Driver d2 = new Driver("D105", "Priya Singh");

        d2.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("D105_C1", "Depot B", 35, 40, 55));
        d2.routeHistory.addCheckpoint(
                new FuelCheckpoint("D105_C2", "Fuel Pump 5", 25, 30, 45));
        d2.routeHistory.addCheckpoint(
                new RestCheckpoint("D105_C3", "Motel Y", 15, 20, 25));

        // 🔷 DRIVER 3
        Driver d3 = new Driver("D103", "Rohit Verma");

        d3.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("D103_C1", "Warehouse C", 50, 60, 60));
        d3.routeHistory.addCheckpoint(
                new FuelCheckpoint("D103_C2", "Fuel Pump 3", 20, 25, 35));
        d3.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("D103_C3", "Client Hub", 30, 40, 70));

        // 🔷 ARRAY OF DRIVERS
        Driver[] drivers = {d1, d2, d3};

        for (Driver d : drivers) {

            System.out.println("\n==============================");
            d.printSummary();

            // ✅ Save driver
            DBService.insertDriver(d);

            // ✅ Save checkpoints
            RouteLinkedList<Checkpoint>.Node temp = d.routeHistory.head;

            while (temp != null) {
                DBService.insertCheckpoint(d.driverId, temp.data);
                temp = temp.next;
            }
        }
    }
}