import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Logger {
    void log(String part, String Activity, int Orientation, Point Position, int CurrentCap, int CurrentTemp) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + " | " + part + " I: " + Activity);
        System.out.println(dateFormat.format(date) + " | " + "I: " + "Current Position: (" + Position.getX() +"," + Position.getY() + ") " +
                "Orientation: " + Orientation + " Temp: " + CurrentTemp + "°C Batt: " + CurrentCap);
    }

    void log(String part, String Activity) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + " | " + part + " I:" + Activity);
    }


}
