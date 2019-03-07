public class Internet extends Service{
    double priceXxtramb;
    double baseMbps;
    double basePrice;
    double xtraMbps;

    @Override
    double getRate() {
        return (basePrice + (priceXxtramb * xtraMbps));
    }

    public Internet(double priceXxtramb, double baseMbps, double basePrice, double xtraMbps) {
        this.priceXxtramb = priceXxtramb;
        this.baseMbps = baseMbps;
        this.basePrice = basePrice;
        this.xtraMbps = xtraMbps;
    }
}

