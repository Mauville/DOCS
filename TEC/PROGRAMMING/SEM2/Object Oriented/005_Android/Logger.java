import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    void logger(String part, String Activity) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + " : " + part + " A:" + Activity);
        System.out.println(dateFormat.format(date) + " : " + "I" + "Current Position: (" + position.toString() + ") " +
                "Orientation: " + orientation + " Temp: " + battSense.getCurrentCap() + " Batt: " + tempSense.getCurrentTemp());
    }
}
