public class Dish {
    String name;
    double price;

   public Dish(String type) {
       if (type == "regular") {
           Regular reg = new Regular();
       }

       if (type == "dessert") {
           Dessert reg = new Dessert();
       }
   }



}