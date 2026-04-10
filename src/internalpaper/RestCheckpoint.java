package internalpaper;

public class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }
    public boolean isCritical() {
        return true;
    }
    public String getType(){
        return "DeliveryCheckpoint";
    }
    public  double calculatePenalty(){
        int delay=actualDuration - expectedDuration;
        if(delay>30){
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0.0;
    }
}
