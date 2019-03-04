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
}
