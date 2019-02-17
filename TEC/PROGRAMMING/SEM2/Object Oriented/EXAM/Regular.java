import java.util.ArrayList;

class Regular{
    String category;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    public double getWeight() {
        double totweight = 0;
        for(int i = 0; i < ingredients.size(); i++) {
            totweight += ingredients.get(i).getWeight();
        }
        return totweight;
    }


}