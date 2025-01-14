/**
 * author: Rami Maarouf
 * date: 01/17/2025
 * RecipeManager for Users!
 */

class NonVegetarianRecipe extends BaseRecipe {
    public NonVegetarianRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }


    @Override
    public String toString() {
        return "Non-Vegetarian " + super.toString();
    }
}