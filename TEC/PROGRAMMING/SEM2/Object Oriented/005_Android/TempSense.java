public class TempSense extends Sensor{
    public int maxTemp, currentTemp, initialTemp, stepstoIncrease;
    public void Increasetemp(){
        currentTemp++;
    }
    public void coolDown(){
        currentTemp = initialTemp;
    }
    public void addStep(){
        super.addStep();


    }
    

}
