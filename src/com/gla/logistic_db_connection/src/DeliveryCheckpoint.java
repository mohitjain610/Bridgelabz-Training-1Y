package com.gla.logistic_db_connection.src;

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }

    boolean isCritical() { return true; }

    String getType() { return "Delivery"; }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}