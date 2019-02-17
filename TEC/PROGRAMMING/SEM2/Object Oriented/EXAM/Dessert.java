class Dessert {
    boolean hasGluten, isLactoseFree;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    public int getCalories() {
        int totclas = 0;
        for(int i = 0; i < ingredients.size(); i++) {
            totclas += ingredients.get(i).getCalories();
        }
        return totclas;
    }
}