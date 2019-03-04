public class Mammal extends Animal {
    @Override
    public void Reproduce() {
        super.name = "Tiger";
        super.sound = "Gah";
        System.out.println("This " + super.name + "has had " + rng.nextInt(10) + " offsprings");
        System.out.println("Reproduction method is birth from mother.");

    }
}
