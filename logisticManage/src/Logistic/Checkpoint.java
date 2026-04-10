package Logistic;

public class Checkpoint {
    String id;
    String location;
    double distance;
    int expectedTime;
    int actualTime;
    public Checkpoint(String id,String location,double distance,int expectedTime,int actualTime){
        this.id=id;
        this.location=location;
        this.distance=distance;
        this.expectedTime=expectedTime;
        this.actualTime=actualTime;
    }
    public boolean isDelayed(){
     return actualTime>expectedTime;
    }
    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}
