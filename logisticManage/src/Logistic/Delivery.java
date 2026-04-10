package Logistic;

public class Delivery extends Checkpoint{
    public Delivery(String id , String loc,double dis,int exp,int acc){
        super(id,loc,dis,exp,acc);
    }
    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "Delivery checkpoint";
    }

    @Override
    public double calculatePenalty() {
        if(!isDelayed()){
            return 0;
        }
        else {
            return (actualTime - expectedTime)*2;
        }
    }
}