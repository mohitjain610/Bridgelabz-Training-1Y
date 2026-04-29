package com.gla.logistic_db_connection.src;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }

    boolean isCritical() { return false; }

    String getType() { return "Rest"; }

    double calculatePenalty() {
        if (!isDelayed()) return 0;

        int delay = actualDuration - expectedDuration;
        if (delay > 30)
            return delay * 0.5;

        return 0;
    }
}
