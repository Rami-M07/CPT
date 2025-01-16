 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Stack;

 /**
 * Author: Rami Maarouf
 * Date: 01/17/2025
 * RecipeManager for Users!
 */
 
 /** 
 * Base class for all recipes
 */
 class BaseRecipe {
     String name;
     String ingredients;
     String instructions;
     int calories;
     boolean isHealthy;
 
     /**  
     * Constructor to initialize the recipe's details
     * @param name: the name of the recipe
     * @param ingredients: the ingredients of the recipe
     * @param instructions: the instructions how the recipe is made
     * @param calories: how many calories in the recipe
     * @param isHealthy: determines it the recipe is healthy or not
     */
     public BaseRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         this.name = name;
         this.ingredients = ingredients;
         this.instructions = instructions;
         this.calories = calories;
         this.isHealthy = isHealthy;
     }
 
     /**  
     * Returns the string representation of the recipe
     * @return the recipe's details
     */
     @Override
     public String toString() { // Combination of Research, notes, & AI to code these lines
         return "Recipe Name: " + name +
                "\nIngredients: " + ingredients +
                "\nInstructions: " + instructions +
                "\nCalories: " + calories +
                "\nHealthy: " + (isHealthy ? "Yes" : "No");
     }
 }
 
 // Halal recipe class extending BaseRecipe
 class HalalRecipe extends BaseRecipe {
     public HalalRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         super(name, ingredients, instructions, calories, isHealthy);
     }
 
     // Override toString method to include Halal in the type of recipes
     @Override
     public String toString() {
         return "Halal " + super.toString();
     }
 }
 
 // Vegetarian recipe class extending BaseRecipe
 class VegetarianRecipe extends BaseRecipe {
     public VegetarianRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         super(name, ingredients, instructions, calories, isHealthy);
     }
 
     // Override toString method to include Vegetarian in the type of recipes
     @Override
     public String toString() {
         return "Vegetarian " + super.toString();
     }
 }
 
 // Non-vegetarian recipe class extending BaseRecipe
 class NonVegetarianRecipe extends BaseRecipe {
     public NonVegetarianRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         super(name, ingredients, instructions, calories, isHealthy);
     }
 
     // Override toString method to include Non-Vegetarian in the type of recipes
     @Override
     public String toString() {
         return "Non-Vegetarian " + super.toString();
     }
 }
 
 // Vegan recipe class extending BaseRecipe
 class VeganRecipe extends BaseRecipe {
     public VeganRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         super(name, ingredients, instructions, calories, isHealthy);
     }
 
     // Override toString method to include Vegan in the type of recipes
     @Override
     public String toString() {
         return "Vegan " + super.toString();
     }
 }

 // Classes for all types of Recipes: Halal, Vegetarian, NonVegetarian, and Vegan
 
 /**  
 * Main class to manage the recipes
 */
 public class RecipeManager {
     private static ArrayList<BaseRecipe> recipes = new ArrayList<>();
     private static Stack<BaseRecipe> favoriteRecipes = new Stack<>();
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         while (true) {
             // Display menu options
             System.out.println("\nYour Recipe Manager!");
             System.out.println("1. Add Halal Recipe");
             System.out.println("2. Add Vegetarian Recipe");
             System.out.println("3. Add Non-Vegetarian Recipe");
             System.out.println("4. Add Vegan Recipe");
             System.out.println("5. View Recipes");
             System.out.println("6. Update Recipe");
             System.out.println("7. Delete Recipe");
             System.out.println("8. Favorite a Recipe");
             System.out.println("9. View Favorite Recipes");
             System.out.println("10. Exit");
             System.out.print("Choose an option: ");
             int choice = scanner.nextInt();
             scanner.nextLine();  // Puts all the options on seperate lines
 
             // Menu handle choices
             switch (choice) {
                 case 1:
                     addRecipe(scanner, "Halal");
                     break;
                 case 2:
                     addRecipe(scanner, "Vegetarian");
                     break;
                 case 3:
                     addRecipe(scanner, "Non-Vegetarian");
                     break;
                 case 4:
                     addRecipe(scanner, "Vegan");
                     break;
                 case 5:
                     viewRecipes();
                     break;
                 case 6:
                     updateRecipe(scanner);
                     break;
                 case 7:
                     deleteRecipe(scanner);
                     break;
                 case 8: 
                     favoriteRecipe(scanner); 
                     break; 
                case 9: 
                     viewFavoriteRecipes(); 
                     break;
                 case 10:
                     System.out.println("Exiting...");
                     return;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
     }
 
     /**
      * Method to add a new recipe.
      * @param scanner is the scanner object to see what the user inputs
      * @param type is the type of the recipe the user wants to add
      */
     static void addRecipe(Scanner scanner, String type) { // AI helped me with this portion of the code
         System.out.print("Enter recipe name: ");
         String name = scanner.nextLine();
 
         System.out.print("Enter ingredients (comma separated): ");
         String ingredients = scanner.nextLine();
 
         System.out.print("Enter instructions: ");
         String instructions = scanner.nextLine();
 
         System.out.print("Enter calories: ");
         int calories = scanner.nextInt();
         scanner.nextLine();  // Next line
 
         System.out.print("Is the recipe healthy (true/false)? ");
         boolean isHealthy = scanner.nextBoolean();
         scanner.nextLine();  // Next line
 
         // Create a new recipe based on the type
         BaseRecipe recipe = null;
         switch (type) {
             case "Halal":
                 recipe = new HalalRecipe(name, ingredients, instructions, calories, isHealthy);
                 break;
             case "Vegetarian":
                 recipe = new VegetarianRecipe(name, ingredients, instructions, calories, isHealthy);
                 break;
             case "Non-Vegetarian":
                 recipe = new NonVegetarianRecipe(name, ingredients, instructions, calories, isHealthy);
                 break;
             case "Vegan":
                 recipe = new VeganRecipe(name, ingredients, instructions, calories, isHealthy);
                 break;
         }
 
         // Add recipe to the list
         recipes.add(recipe);
         System.out.println(type + " recipe added successfully!");
     }
 
     /**
      * Method to view all recipes
      */
     private static void viewRecipes() {
         if (recipes.isEmpty()) {
             System.out.println("No recipes available.");
         } else {
             for (BaseRecipe recipe : recipes) {
                 System.out.println(recipe);
                 System.out.println("-------------------------");
             }
         }
     }
 
     /**
      * Method to update an existing recipe
      * @param scanner to scan objects for user's input
      */
     private static void updateRecipe(Scanner scanner) {
         System.out.print("Enter the recipe name to update: ");
         String name = scanner.nextLine();
 
         BaseRecipe recipeToUpdate = null;
         for (BaseRecipe recipe : recipes) {
             if (recipe.name.equalsIgnoreCase(name)) { // AI helped me with this line 
                 recipeToUpdate = recipe;
                 break;
             }
         }
 
         if (recipeToUpdate != null) {
             System.out.print("Enter new ingredients (comma separated): ");
             String ingredients = scanner.nextLine();
 
             System.out.print("Enter new instructions: ");
             String instructions = scanner.nextLine();
 
             System.out.print("Enter new calories: ");
             int calories = scanner.nextInt();
             scanner.nextLine();  // Next line
 
             System.out.print("Is the recipe healthy (true/false)? ");
             boolean isHealthy = scanner.nextBoolean();
             scanner.nextLine();  // Next line
 
             // Update the recipe's details
             recipeToUpdate.ingredients = ingredients;
             recipeToUpdate.instructions = instructions;
             recipeToUpdate.calories = calories;
             recipeToUpdate.isHealthy = isHealthy;
 
             System.out.println("Recipe updated successfully!");
         } else {
             System.out.println("Recipe not found.");
         }
     }
 
     /**
      * Method to delete a recipe
      * @param scanner the scanner object for the user's input
      */
     static void deleteRecipe(Scanner scanner) {
         System.out.print("Enter the recipe name to delete: ");
         String name = scanner.nextLine();
 
         BaseRecipe recipeToDelete = null;
         for (BaseRecipe recipe : recipes) {
             if (recipe.name.equalsIgnoreCase(name)) {
                 recipeToDelete = recipe;
                 break;
             }
         }
 
         if (recipeToDelete != null) {
             recipes.remove(recipeToDelete);
             System.out.println("Recipe deleted successfully!");
         } else {
             System.out.println("Recipe not found.");
         }
     }
      
    /**
     * Method to mark a recipe as favorite
     * @param scanner the scanner object for the user's input
     */
    static void favoriteRecipe(Scanner scanner) {
        System.out.print("Enter the recipe name to favorite: ");
        String name = scanner.nextLine();

        BaseRecipe recipeToFavorite = null;
        for (BaseRecipe recipe : recipes) {
            if (recipe.name.equalsIgnoreCase(name)) {
                recipeToFavorite = recipe;
                break;
            }
        }

        if (recipeToFavorite != null) {
            favoriteRecipes.push(recipeToFavorite);
            System.out.println("Recipe favorited successfully!");
        } else {
            System.out.println("Recipe not found.");
        }
    }

    /**
     * Method to view all favorite recipes
     */
    private static void viewFavoriteRecipes() {
        if (favoriteRecipes.isEmpty()) {
            System.out.println("No favorite recipes available.");
        } else {
            for (BaseRecipe recipe : favoriteRecipes) {
                System.out.println(recipe);
                System.out.println("-------------------------");
            }
        }
    }
}
 