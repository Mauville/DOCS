// I think copying code from the board in class is not the best way to go to learn things. I've been building the
// past (and this) assignments from the ground up. This one was especially tricky

// This is a different implementation than the one seen in class. I found no need to have a "steps"
// attribute as all the changes are calculated JIT. Below are some questions that I got while developing the program

// How much time do you actually spend debugging? I used around 45 minutes for this one and I think it was a bit too much

// Is it okay to use an IDE/Debugger? I've been using IntelliJ for a while and the debugging, linting and  the overall experience is nice.
// I've heard from some teachers before that it's potentially harmful in the long run. I think that some best practices
// and the familiarization with deeper concepts of the Java API can be slowly learnt by using one.

// What is your opinion on these?



import java.awt.Point;

public class Android {

    public Android(int maxCap, int minCap, int stepstoDecrease, int initialCap, int maxTemp, int initialTemp, int stepstoIncrease) {
        battSense = new BatSense(maxCap, minCap, stepstoDecrease, initialCap);
        tempSense = new TempSense(maxTemp, initialTemp, stepstoIncrease);
    }

    private int orientation = 1;


    private Logger log = new Logger();
    private Point position = new Point();
    BatSense battSense;
    TempSense tempSense;


    void move(int steps) {
        if (battSense.canMove(steps)) {
            if (tempSense.canMove(steps)) {
                battSense.computeSteps(steps);
                tempSense.computeSteps(steps);
                switch (orientation) {
                    case 1:
                        position.move(position.x + steps, position.y);
                        log.log("MOVE", "Moved " + steps + " steps to the North", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
                        break;
                    case 2:
                        position.move(position.x, position.y + steps);
                        log.log("MOVE", "Moved " + steps + " steps to the West", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
                        break;
                    case 3:
                        position.move(position.x - steps, position.y);
                        log.log("MOVE", "Moved " + steps + " steps to the South", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
                        break;
                    case 4:
                        position.move(position.x, position.y - steps);
                        log.log("MOVE", "Moved " + steps + " steps to the West", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
                        break;
                }
            } else
                log.log("TEMP", "The requested action would overheat the robot", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
        } else
            log.log("BATT", "Insuficient battery to perform the action", orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());

    }

    void rotate(int direction) {

        if (this.orientation == 1 && direction == -1)
            this.orientation = 4;
        else if (this.orientation == 4 && direction == 1)
            this.orientation = 1;
        else
        this.orientation += direction;

        String sorient = this.orientation < 0 ? "West" : "East";
        log.log("ROTATE", "Rotated to the " + sorient, this.orientation, position, battSense.getCurrentCap(), tempSense.getCurrentTemp());
    }
}

// OLD QUESTIONS
// I really got stuck at some parts of this program. It was either because i was trying to mentally map a huge function or
// simply not being able to figure a problem to solve, let alone a solution.
// when we are tackling a problem at a much bigger scale, whats a good methodology for developing?
// I think just jumping directly to PseudoCode or mindmaps won't cut it for bigger projects
    // It will. Using class diagrams, use cases and other UML's work.

// if i use generics on an arraylist, can i call a children object if the generic is the parent?
    // YES! its called polymorphism

// when is it appropiate to use an object? EG. i have this logger function that gets called all the time from everywhere, why shouldn't it be an object?
    // when its gonna be used in multiple places and inheritance or other relationships arent appropiate

