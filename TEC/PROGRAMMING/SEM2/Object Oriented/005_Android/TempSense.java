public class TempSense{
    private int maxTemp, currentTemp, initialTemp, stepstoIncrease;
    private Logger log = new Logger();

    boolean canMove(int steps) {
        boolean canmove = true;
        if (steps % stepstoIncrease == 0) {
            if (steps / stepstoIncrease >= currentTemp)
                canmove = false;
        }
        return canmove;
    }

    void coolDown() {
        log.log("BATT", "Temperature limit has been reached or cooldown has been requested");
        currentTemp = initialTemp;
        log.log("BATT", "Temperature has returned to normal");
    }

    int getCurrentTemp() {
        return currentTemp;
    }

    public TempSense(int maxTemp, int initialTemp, int stepstoIncrease) {
        this.maxTemp = maxTemp;
        this.currentTemp = initialTemp;
        this.initialTemp = initialTemp;
        this.stepstoIncrease = stepstoIncrease;
    }

    void computeSteps(int steps) {
        currentTemp += steps / stepstoIncrease;
        if (currentTemp == maxTemp)
            coolDown();
    }
}
