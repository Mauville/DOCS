import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {
        Videogame oddysey = new Videogame();

        oddysey.publisher = "Nintendo";
        oddysey.platform = "Switch";
        oddysey.region = "America";
        oddysey.title = "Mario thing";
        oddysey.genre = "platforms";
        oddysey.classification = "E";
        oddysey.lang = "English";
        oddysey.releaseDate = new GregorianCalendar(2018, 11, 11);


//      A child object can be assigned to a object of the parent class
//        DigitalMedia err = new Videogame();
//        System.out.println(err.toString());
//      This will print the method form the children eg. Overriding

//      Class attributes are parent's. Class methods are children's

        Movie m = new Movie();
        m.title = "Seven";
        m.director = "David Fincher";
        m.duration = 120;
        m.classification = "18+";
        m.genre = "Thriller";

        DigitalMedia [] dm = new DigitalMedia[10];

//        This is called casting
//        Specifically, this is upcasting or implicit, which is casting a children to a parent.
//            Upcasting/Implicit : DigitalMedia -> Movie
//              Downcasting/Explicit: Movie -> DigitalMedia
//        The inverse, an downcast or explicit is not automatic as it cannot be done sometimes

        dm[0] = oddysey;
        dm[1] = m;

        System.out.println(dm[0]);
        System.out.println(dm[1]);

    }
}
