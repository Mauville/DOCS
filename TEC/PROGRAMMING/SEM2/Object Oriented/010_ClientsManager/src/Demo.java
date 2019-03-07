import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        SysClients system = new SysClients();
        Client mike = new Client();
        Service AXT = new TV(40,10);
        Service infinitumInt =  new Internet(10, 10, 200, 10);
        Service infinitumLandline = new Landline(1,1);


        ((Landline) infinitumLandline).localnum = 10;
        ((Landline) infinitumLandline).cellcall = 15;
        ((TV) AXT).premiumChannels = 10;


        mike.contracts.add(AXT);
        mike.contracts.add(infinitumInt);
        mike.contracts.add(infinitumLandline);

        system.clients.add(mike);

        System.out.println(system.clients.get(0).contracts.get(0).getRate());
        System.out.println(system.clients.get(0).contracts.get(1).getRate());
        System.out.println(system.clients.get(0).contracts.get(2).getRate());

        system.clients.get(0).calculateMonthly();
        System.out.println(system.clients.get(0).getMonthlyPayment());


        System.out.println(system.getIncome());

        //Extra demo of other providers

        Service AXTLandline = new Landline(10);
        Service ATTLandline = new Landline(10);

        Service AXTSATInt = new Internet(10, 10, 5000,  0);
        Service AXTFIBInt = new Internet(1, 20, 350,  0);
        Service ATTInt = new Internet(10,50,40,0);
        Service ATTtv = new TV(40, 10);
    }
}
