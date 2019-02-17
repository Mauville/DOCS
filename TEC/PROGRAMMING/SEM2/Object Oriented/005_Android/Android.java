//if i use generics on an arraylist, can i call a children object if the generic is the parent?
// when is it appropiate to use an object. EG. i have this logger function that gets called all the time from everywhere, should it be an object?
// when we are tackling a problem at a much bigger scale, whats a good methodology for developing? Pseudo coding?

import java.awt.Point;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Android {

    public static int steps, orientation;
    Point position = new Point();
    private Sensor battSense;
    private Sensor tempSense;

    // Taking into account direction, move to it
    public void move(int steps) {
        switch (orientation) {
            case 1:
                position.move(position.x + steps, position.y);
                logger("MOVE", "Moved " + steps + "steps to the North");
                break;
            case 2:
                position.move(position.x, position.y + steps);
                logger("MOVE", "Moved " + steps + "steps to the West");
                break;
            case 3:
                position.move(position.x - steps, position.y);
                logger("MOVE", "Moved " + steps + "steps to the South");
                break;
            case 4:
                position.move(position.x, position.y - steps);
                logger("MOVE", "Moved " + steps + "steps to the South");
                break;
        }
    }

    public void rotate(int direction) {
        this.orientation += direction;
        String sorient = this.orientation < 0 ? "West" : "East";
        logger("ROTATE", "Rotated to the " + sorient);
    }

    public void logger(String part, String Activity) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + " : " + part + " A:" + Activity);
        System.out.println(<++>);
    }

    public static int getSteps() {
        return steps;
    }
}

