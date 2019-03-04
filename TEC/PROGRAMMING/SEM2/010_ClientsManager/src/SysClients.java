import java.util.ArrayList;

public class SysClients {
    ArrayList <Client> clients = new ArrayList<>();

    double getIncome() {
        double total = 0;
        for (Client client : clients) {
            client.calculateMonthly();
            total += client.monthlyPayment;
        }
        return total;
    }
}
