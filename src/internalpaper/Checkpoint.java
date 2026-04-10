package internalpaper;

abstract class Checkpoint {
    String id;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id,String locationName,double distanceFromLast,int expectedDuration,int actualDuration){
        this.id=id;
        this.locationName=locationName;
        this.distanceFromLast=distanceFromLast;
        this.expectedDuration=expectedDuration;
        this.actualDuration=actualDuration;
    }
    boolean isDelayed(){
        return actualDuration>expectedDuration;
    }
    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}
