public class Main{

    public static void main(String [] args){
    Animal generic = new Animal();
    generic.setName("Amorphus");
    generic.setSound("tweeet");
    //Overloading
    generic.makeSound();
    //Overloading
    generic.makeSound(true);

    //Overriding
    generic.Reproduce();
    Ovipositor bird = new Ovipositor();
    bird.Reproduce();
    Mammal cat = new Mammal();
    cat.Reproduce();
    

    }
}

    
