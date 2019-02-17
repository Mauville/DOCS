public class BatSense extends Sensor{
    public int maxCap, currentCap, minCap, stepstoDecrease, initialCap;
    //constructor
    //
    public void diminishcap(){
        currentCap--;
    }
    public void recharge(){
        currentCap = maxCap;
    }

    

}
