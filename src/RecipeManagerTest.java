 /**
 * Author: Rami Maarouf
 * Date: 01/17/2025
 * RecipeManager for Users!
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class RecipeManagerTest {

    @Test
    public void testViewRecipes() {
        // Arrange
        RecipeManager.addRecipe(new Scanner("Recipe1\nIngredients1\nInstructions1\n100\ntrue\n"), "Halal");
        RecipeManager.addRecipe(new Scanner("Recipe2\nIngredients2\nInstructions2\n200\nfalse\n"), "Vegetarian");

        // Act
        RecipeManager.viewRecipes();

        // Assert
        // Check output as viewRecipes prints
    }

    @Test
    public void testUpdateRecipe() {
        // Arrange
        RecipeManager.addRecipe(new Scanner("UpdateTest\nIngredients\nInstructions\n100\ntrue\n"), "Vegan");
        Scanner scanner = new Scanner("UpdateTest\nUpdated Ingredients\nUpdated Instructions\n150\nfalse\n");

        // Act
        RecipeManager.updateRecipe(scanner);

        // Assert (AI helped me here)
        BaseRecipe actual = RecipeManager.getRecipes().stream().filter(recipe -> recipe.name.equals("UpdateTest")).findFirst().orElse(null);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals("Updated Ingredients", actual.ingredients);
        Assertions.assertEquals("Updated Instructions", actual.instructions);
        Assertions.assertEquals(150, actual.calories);
        Assertions.assertFalse(actual.isHealthy);
    }

    @Test
    public void testDeleteRecipe() {
        // Arrange
        RecipeManager.addRecipe(new Scanner("DeleteTest\nIngredients\nInstructions\n100\ntrue\n"), "Non-Vegetarian");
        Scanner scanner = new Scanner("DeleteTest\n");

        // Act
        RecipeManager.deleteRecipe(scanner);

        // Assert (AI helped me with this line of code)
        boolean recipeExists = RecipeManager.getRecipes().stream().anyMatch(recipe -> recipe.name.equals("DeleteTest"));
        Assertions.assertFalse(recipeExists);
    }

    @Test
    public void testFavoriteRecipe() {
        // Arrange
        RecipeManager.addRecipe(new Scanner("FavoriteTest\nIngredients\nInstructions\n100\ntrue\n"), "Halal");
        Scanner scanner = new Scanner("FavoriteTest\n");

        // Act
        RecipeManager.favoriteRecipe(scanner);

        // Assert
        BaseRecipe actual = RecipeManager.getFavoriteRecipes().peek();
        Assertions.assertEquals("FavoriteTest", actual.name);
    }

    @Test
    public void testViewFavoriteRecipes() {
        // Arrange
        RecipeManager.addRecipe(new Scanner("FavoriteTest\nIngredients\nInstructions\n100\ntrue\n"), "Halal");
        Scanner scanner = new Scanner("FavoriteTest\n");
        RecipeManager.favoriteRecipe(scanner);

        // Act
        RecipeManager.viewFavoriteRecipes();

        // Assert
        // Check output as viewFavoriteRecipes prints
    }
}
