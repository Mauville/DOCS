// I think copying code from the board in class is not the best way to go to learn things. I've been building the
// past (and this) assignments from the ground up. This one was especially tricky

// This is a different implementation than the one seen in class. I found no need to have a "steps"
// attribute as all the changes are calculated JIT. Below are some questions that I got while developing the program
//
// if i use generics on an arraylist, can i call a children object if the generic is the parent?
// when is it appropiate to use an object? EG. i have this logger function that gets called all the time from everywhere, why shouldn't it be an object?
// I really got stuck at some parts of this program. It was either because i was trying to mentally map a huge function or
// simply not being able to figure a problem to solve, let alone a solution.
// when we are tackling a problem at a much bigger scale, whats a good methodology for developing? I think just jumping
// directly to PseudoCode or mindmaps won't cut it for bigger projects

import java.awt.Point;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Android {

    private int steps, orientation;
    private Point position = new Point();
    private BatSense battSense = new BatSense();
    private TempSense tempSense = new TempSense();

    // Taking into account direction, move to it
    public void move(int steps) {
        if (battSense.canMove(steps)) {
            if (tempSense.canMove(steps)) {
                battSense.computeSteps(steps);
                tempSense.computeSteps(steps);
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
            } else
                logger("TEMP", "The requested action would overheat the robot");
        } else
            logger("BATT", "Insuficient battery to perform the action");

    }

    public void rotate(int direction) {
        this.orientation += direction;
        String sorient = this.orientation < 0 ? "West" : "East";
        logger("ROTATE", "Rotated to the " + sorient);
    }

    void logger(String part, String Activity) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + " : " + part + " A:" + Activity);
        System.out.println(dateFormat.format(date) + " : " + "I" + "Current Position: (" + position.toString() + ") " + "Orientation: " + orientation + " Temp: " + battSense.getCurrentCap() + " Batt: " + tempSense.getCurrentTemp());
    }

}
