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
    //Infinitum
    public Landline(double ratelocal, double ratecell) {
        this.ratelocal = ratelocal;
        this.ratecell = ratecell;
    }

    //Others
    public Landline(double rateunlimited) {
        this.rateunlimited = rateunlimited;
    }


    public int getLocalnum() {
        return localnum;
    }

    public void setLocalnum(int localnum) {
        this.localnum = localnum;
    }

    public int getCellcall() {
        return cellcall;
    }

    public void setCellcall(int cellcall) {
        this.cellcall = cellcall;
    }
}
