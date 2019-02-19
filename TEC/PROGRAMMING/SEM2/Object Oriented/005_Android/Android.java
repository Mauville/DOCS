// I think copying code from the board in class is not the best way to go to learn things. I've been building the
// past (and this) assignments from the ground up. This one was especially tricky

// This is a different implementation than the one seen in class. I found no need to have a "steps"
// attribute as all the changes are calculated JIT. Below are some questions that I got while developing the program
//
// if i use generics on an arraylist, can i call a children object if the generic is the parent?
    // YES! its called polymorphism

// when is it appropiate to use an object? EG. i have this logger function that gets called all the time from everywhere, why shouldn't it be an object?
    // when its gonna be used in multiple places and inheritance or other relationships arent appropiate

// I really got stuck at some parts of this program. It was either because i was trying to mentally map a huge function or
// simply not being able to figure a problem to solve, let alone a solution.
// when we are tackling a problem at a much bigger scale, whats a good methodology for developing?
// I think just jumping directly to PseudoCode or mindmaps won't cut it for bigger projects
    // It will. Using class diagrams, use cases and other UML's work.

import java.awt.Point;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Android {

    public int maxCap, currentCap, minCap, stepstoDecrease, initialCap;
    public int maxTemp, currentTemp, initialTemp, stepstoIncrease;
    private int orientation = 1;


    private Logger log = new logger
    private Point position = new Point();
    public BatSense battSense = new BatSense(maxCap, minCap, stepstoDecrease, initialCap);
    public TempSense tempSense = new TempSense(maxTemp, initialTemp, stepstoIncrease);


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


    public Android(int maxCap, int currentCap, int minCap, int stepstoDecrease, int initialCap, int maxTemp, int currentTemp, int initialTemp, int stepstoIncrease) {
        this.maxCap = maxCap;
        this.currentCap = currentCap;
        this.minCap = minCap;
        this.stepstoDecrease = stepstoDecrease;
        this.initialCap = initialCap;
        this.maxTemp = maxTemp;
        this.currentTemp = currentTemp;
        this.initialTemp = initialTemp;
        this.stepstoIncrease = stepstoIncrease;
    }
}
