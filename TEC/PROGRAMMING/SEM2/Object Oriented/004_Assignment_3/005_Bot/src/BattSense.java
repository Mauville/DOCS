public class BattSense {
    int level = 0;
    public BattSense(int level) {
        this.level = level;
    }
    public boolean Recharge() {
        boolean r = this.level == 0 ? true : false;
        return r;
    }
}
