/*


According to the description given below, write the code of the classes Vehicle and Report. Next, create a new class with a main method, and create two objects of every class. Finally, invent an additional method inside the Vehicle class to make some calculations utilizing the data available in the report. Call this method in the main method and display its result.

A factory builds vehicles for the Tesla brand. To produce a unit, it requires knowing the model, color, if it requires autopilot, tire size and motor torque. Once the vehicle is finished, a review of the following aspects is carried out:

    Time to reach 60 mph
    Proper operation of the autopilot
    Maximum speed

This report is attached to each vehicle.
*/
public class main{
    public static void main(String[] args){
        Vehicle car1 = new Vehicle();
        System.out.println(car1.PassedTest());
        Vehicle car2 = new Vehicle();
        System.out.println(car2.PassedTest());

    }
}
