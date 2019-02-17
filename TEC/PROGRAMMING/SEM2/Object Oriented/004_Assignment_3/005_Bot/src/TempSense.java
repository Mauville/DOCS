public class TempSense {
    int currrentTemp = 0;
    int maxtemp = 0;

    public TempSense(int currrentTemp, int maxtemp) {
        this.currrentTemp = currrentTemp;
        this.maxtemp = maxtemp;
    }

    public boolean Cooldown() {
        if (this.currrentTemp >= maxtemp) {
            return true;
        } else
            return false;
    }
}
