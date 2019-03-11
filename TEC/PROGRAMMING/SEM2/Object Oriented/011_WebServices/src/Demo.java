import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Service.basePrice = 1000;
        Date year = new Date(2019);
        Service addon = new Addon(true);
        Service webapp = new WebApp(year);
        Service hosting = new Hosting(200, 2000);

        System.out.println(addon.getPrice());
        System.out.println(webapp.getPrice());
        System.out.println(hosting.getPrice());
    }
}
