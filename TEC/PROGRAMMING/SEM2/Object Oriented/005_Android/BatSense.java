public class BatSense extends Android {
    public int maxCap, currentCap, minCap, stepstoDecrease, initialCap;

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
        super.logger("BATT", "Battery depleted...");
        currentCap = maxCap;
        super.logger("BATT", "The battery has recharged");
    }

    public void diminisher(int steps) {
        // how to know if battery should diminish

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
}
