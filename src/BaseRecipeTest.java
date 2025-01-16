/**
 * Author: Rami Maarouf
 * Date: 01/17/2025
 * BaseRecipe test!
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseRecipeTest {
    @Test
    public void testBaseRecipe_toString() {
        // Arrange
        BaseRecipe recipe = new BaseRecipe("Yummy Yum Yum", "Eggs, Noodles", "Step 1, Step 2", 500, true);

        // Act
        String actual = recipe.toString();

        // Assert
        String expected = "Recipe Name: Yummy Yum Yum\nIngredients: Eggs, Noodles\nInstructions: Step 1, Step 2\nCalories: 500\nHealthy: Yes";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHalalRecipe_toString() {
        // Arrange
        BaseRecipe recipe = new HalalRecipe("Halal Chicken", "Chicken duh, Sauce", "Step 1, Step 2", 300, true);

        // Act
        String actual = recipe.toString();

        // Assert
        String expected = "Halal Recipe Name: Halal Chicken\nIngredients: Chicken duh, Sauce\nInstructions: Step 1, Step 2\nCalories: 300\nHealthy: Yes";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVegetarianRecipe_toString() {
        // Arrange
        BaseRecipe recipe = new VegetarianRecipe("Vegetarian Yum", "Veggies, More Veggies", "Step 1, Step 2", 200, true);

        // Act
        String actual = recipe.toString();

        // Assert
        String expected = "Vegetarian Recipe Name: Vegetarian Yum\nIngredients: Veggies, More Veggies\nInstructions: Step 1, Step 2\nCalories: 200\nHealthy: Yes";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNonVegetarianRecipe_toString() {
        // Arrange
        BaseRecipe recipe = new NonVegetarianRecipe("Non-Vegetarian", "Meat, Chicken", "Step 1, Step 2", 400, false);

        // Act
        String actual = recipe.toString();

        // Assert
        String expected = "Non-Vegetarian Recipe Name: Non-Vegetarian\nIngredients: Meat, Chicken\nInstructions: Step 1, Step 2\nCalories: 400\nHealthy: No";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVeganRecipe_toString() {
        // Arrange
        BaseRecipe recipe = new VeganRecipe("Vegan", "Tofu, More Tofu", "Step 1, Step 2", 150, true);

        // Act
        String actual = recipe.toString();

        // Assert
        String expected = "Vegan Recipe Name: Vegan\nIngredients: Tofu, More Tofu\nInstructions: Step 1, Step 2\nCalories: 150\nHealthy: Yes";
        Assertions.assertEquals(expected, actual);
    }
}
