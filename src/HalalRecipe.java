/**
 * author: Rami Maarouf
 * date: 01/17/2025
 * RecipeManager for Users!
 */

class HalalRecipe extends BaseRecipe {
    public HalalRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }


    @Override
    public String toString() {
        return "Halal " + super.toString();
    }
}
