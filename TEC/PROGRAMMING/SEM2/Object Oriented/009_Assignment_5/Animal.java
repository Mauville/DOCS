import java.util.Random;

public class Animal {
    String name;
    String sound;
    Random rng = new Random();

    //Overloading
    public void makeSound() {
            System.out.println(sound);
    }

    //Overloading
    public void makeSound( boolean angry) {
        System.out.println(sound.toUpperCase() + "!!!");
    }

    public void Reproduce() {
        System.out.println("This " + this.name + " has had " + rng.nextInt(10) + " offsprings");
        System.out.println("Reproduction method is unknown.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
