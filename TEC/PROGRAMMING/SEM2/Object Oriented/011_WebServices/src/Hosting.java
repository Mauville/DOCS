public class Hosting extends Service {
    private int usage;
    private int bits;

    @Override
    double getPrice() {
        double xtraMb = (this.usage - 100) % 100;
        double xtraBits = (this.bits - 1000) % 1000;
        double xtraMBprice = (super.basePrice / 100) + (xtraMb * (super.basePrice * .5 / 100));
        double xtraBitPrice = (super.basePrice * 2 / 100) + (xtraBits * (super.basePrice * .5 / 100));
        return (xtraBitPrice + xtraMBprice);
    }

    Hosting(int usage, int bits) {
        this.usage = usage;
        this.bits = bits;
    }
}
