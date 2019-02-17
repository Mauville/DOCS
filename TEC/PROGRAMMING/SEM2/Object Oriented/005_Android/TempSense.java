public class TempSense extends Sensor{

//    tempstats()
//    move()

    public int maxTemp, currentTemp, initialTemp, stepstoIncrease;

    public void increasetemp(){
        currentTemp++;
    }

    public void coolDown(){
        currentTemp = initialTemp;
    }

    public void addStep(){
        super.addStep();
    }
    public void geTempstats() {
    }
    

}
