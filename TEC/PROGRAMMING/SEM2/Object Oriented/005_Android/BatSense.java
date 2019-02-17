public class BatSense extends Sensor {
    public int maxCap, currentCap, minCap, stepstoDecrease, initialCap;

    public boolean canMove(int steps) {
        //test case if battery after move is negative
        // confirm battery decrease
        // if true check percent
        // if cap - perc < 0 print no
        // else proceed

        if ((Android.getSteps() + steps) % stepstoDecrease == 0)
            if ()
                return true
        else
                return false
    }

        if ((Android.getSteps() + steps) % stepstoDecrease == 0)
    public void diminishcap() {
        currentCap--;
    }

    public void recharge() {
        <++>
        currentCap = maxCap;
    }

    public void battstats() {
        <++>
    }

    public void move() {
        <++>
    }


    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public int getCurrentCap() {
        return currentCap;
    }

    public void setCurrentCap(int currentCap) {
        this.currentCap = currentCap;
    }

    public int getMinCap() {
        return minCap;
    }

    public void setMinCap(int minCap) {
        this.minCap = minCap;
    }

    public int getStepstoDecrease() {
        return stepstoDecrease;
    }

    public void setStepstoDecrease(int stepstoDecrease) {
        this.stepstoDecrease = stepstoDecrease;
    }

    public int getInitialCap() {
        return initialCap;
    }

    public void setInitialCap(int initialCap) {
        this.initialCap = initialCap;
    }
}
