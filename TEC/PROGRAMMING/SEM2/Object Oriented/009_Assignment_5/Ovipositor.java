public class Ovipositor extends Animal{
    @Override
    public void Reproduce() {
        super.name = "Finch";
        super.sound = "Caw";
        System.out.println("This " + super.name + "has had " + rng.nextInt(10) + " offsprings");
        System.out.println("Reproduction method is birth from egg.");

    }
}
