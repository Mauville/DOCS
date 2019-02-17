public class TempSense extends Android{

//    tempstats()
//    move()

    public int maxTemp, currentTemp, initialTemp, stepstoIncrease;

    public boolean canMove(int steps) {
        boolean canmove = true;
        if (steps % stepstoIncrease == 0) {
            if (steps / stepstoIncrease >= currentTemp)
                canmove = false;
        }
        return canmove;
    }
    public void increasetemp(){
        currentTemp++;
    }

    public void coolDown(){
        super.logger("BATT", "Overheat...");
        currentTemp = initialTemp;
        super.logger("BATT", "Temperature has returned to normal");
    }

    public int getCurrentTemp() {
        return currentTemp;
    }
    public void computeSteps(int steps) {
        currentTemp += steps / stepstoIncrease;
        if (currentTemp == maxTemp)
            coolDown();
    }
}
