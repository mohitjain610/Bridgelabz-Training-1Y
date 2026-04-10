package internalpaper;

public class FuelCheckpoint extends Checkpoint{
    public FuelCheckpoint(String id, String name, double d, int e, int a) {
        super(id, name, d, e, a);
    }
    public boolean isCritical() {
        return true;
    }
    public String getType(){
        return "FuelCheckpoint";
    }
    public  double calculatePenalty(){
        if(isDelayed()){
            return 10;
        }
        return 0.0;
    }
}
