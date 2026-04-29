package com.gla.logistic_db_connection.src;

class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory = new RouteLinkedList<>();

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double dist = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = dist - penalty;

        System.out.println("Total Distance: " + dist);
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " +
                (routeHistory.checkCritical()
                        ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}