import java.util.ArrayList;

public class Client {
    ArrayList<Service> contracts = new ArrayList<>();
    double monthlyPayment;

    void addService(Service serv) {
        contracts.add(serv);
    }

    void calculateMonthly() {
        for (Service t : contracts) {
            this.monthlyPayment += t.getRate();
        }
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
