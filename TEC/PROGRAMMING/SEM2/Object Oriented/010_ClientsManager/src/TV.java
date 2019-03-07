public class TV extends Service{
    double basicRate;
    int premiumChannels;
    double premiumRate;

    //AXT
//    TV() {
//    }
    @Override
    double getRate() {
        return (basicRate + (premiumChannels * premiumRate));
    }

    public TV(double basicRate, double premiumRate) {
        this.basicRate = basicRate;
        this.premiumRate = premiumRate;
    }


    public void setPremiumChannels(int premiumChannels) {
        this.premiumChannels = premiumChannels;
    }
}
