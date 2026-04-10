package Logistic;

public class RestCheckpoint extends Checkpoint {

        public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }
       @Override
       public boolean isCritical() {
            return false;
        }
   @Override
      public   String getType() {
            return "RestCheckpoint";
        }
@Override
       public double calculatePenalty() {
            if (!isDelayed()) return 0;
            int delay = actualTime - expectedTime;
            return delay > 30 ? delay * 0.5 : 0;
        }
    }