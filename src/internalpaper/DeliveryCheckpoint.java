package internalpaper;

public class DeliveryCheckpoint extends Checkpoint{
    public DeliveryCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }
    public boolean isCritical() {
        return true;
    }
    public String getType(){
        return "DeliveryCheckpoint";
    }
    public  double calculatePenalty(){
        if(isDelayed()){
            return (actualDuration - expectedDuration) * 2;
        }
        return 0.0;
    }
}
