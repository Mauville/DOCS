public class BatSense extends Android {
    public int maxCap, currentCap, minCap, stepstoDecrease, initialCap;

    public BatSense(int maxCap, int minCap, int stepstoDecrease, int initialCap) {
        this.maxCap = maxCap;
        this.minCap = minCap;
        this.stepstoDecrease = stepstoDecrease;
        this.initialCap = initialCap;
        this.currentCap = initialCap;
    }

    public boolean canMove(int steps) {
        boolean canmove = true;
        //check if battery will decrease
        if (steps % stepstoDecrease == 0) {
            // Check if battery decrement goes beyond the negative
            if (steps / stepstoDecrease >= currentCap)
                canmove = false;
        }
        return canmove;
    }

    public void computeSteps(int steps) {
        currentCap -= steps / stepstoDecrease;
        if (currentCap == 0)
            recharge();
    }

    public void recharge() {
        super.logger("BATT", "Battery depleted or manual recharge requested");
        currentCap = maxCap;
        super.logger("BATT", "The battery has recharged");
    }

    public int getCurrentCap() {
        return currentCap;
    }
}
