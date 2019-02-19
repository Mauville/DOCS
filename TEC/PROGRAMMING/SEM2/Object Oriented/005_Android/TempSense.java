public class TempSense extends Android {

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

    public void coolDown() {
        super.logger("BATT", "Temperature limit has been reached or cooldown has been requested");
        currentTemp = initialTemp;
        super.logger("BATT", "Temperature has returned to normal");
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public TempSense(int maxTemp, int initialTemp, int stepstoIncrease) {
        this.maxTemp = maxTemp;
        this.currentTemp = initialTemp;
        this.initialTemp = initialTemp;
        this.stepstoIncrease = stepstoIncrease;
    }

    public void computeSteps(int steps) {
        currentTemp += steps / stepstoIncrease;
        if (currentTemp == maxTemp)
            coolDown();
    }
}
