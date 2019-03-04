public class Internet extends Service{
    boolean satellite;
    double priceXxtramb;
    double baseMbps;
    double basePrice;
    double xtraMbps;

//    //Axt
//    Internet(){}
//    //Inf
//    Internet(){}
//    //ATT
//    Internet(){}
    @Override
    double getRate() {
        return (basePrice + priceXxtramb * xtraMbps);
    }
}
