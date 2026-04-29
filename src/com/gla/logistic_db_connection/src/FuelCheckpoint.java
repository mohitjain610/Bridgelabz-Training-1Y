package com.gla.logistic_db_connection.src;
class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }

    boolean isCritical() { return true; }

    String getType() { return "Fuel"; }

    double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}
