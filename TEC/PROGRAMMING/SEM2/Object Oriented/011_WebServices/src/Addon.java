public class Addon extends Service {
    private boolean firsttime;

    @Override
    double getPrice() {
        if (this.firsttime)
            return ((basePrice * 20) / 100);
        else
            return ((basePrice * 10) / 100);
    }
    Addon(boolean firsttime) {
        this.firsttime = firsttime;
    }
}
