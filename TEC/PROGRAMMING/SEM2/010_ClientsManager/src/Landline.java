public class Landline extends Service {
    double ratelocal, ratecell, rateunlimited;
    boolean unlimited;
    int localnum, cellcall;

    @Override
    double getRate() {
       if (unlimited)
           return rateunlimited;
       return ((localnum*ratelocal)+(cellcall+cellcall));

    }
}
