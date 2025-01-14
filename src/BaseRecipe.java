/**
 * author: Rami Maarouf
 * date: 01/17/2025
 * RecipeManager for Users!
 */

class BaseRecipe {
    String name;
    String ingredients;
    String instructions;
    int calories;
    boolean isHealthy;


    public BaseRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.calories = calories;
        this.isHealthy = isHealthy;
    }


    @Override
    public String toString() {
        return "Recipe Name: " + name +
               "\nIngredients: " + ingredients +
               "\nInstructions: " + instructions +
               "\nCalories: " + calories +
               "\nHealthy: " + (isHealthy ? "Yes" : "No");
    }
}