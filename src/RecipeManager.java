/**
 * Author: Rami Maarouf
 * Date: 01/17/2025
 * RecipeManager for Users!
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 // Base class for all recipes
 class BaseRecipe {
     String name;
     String ingredients;
     String instructions;
     int calories;
     boolean isHealthy;
 
     // Constructor to initialize recipe attributes
     public BaseRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
         this.name = name;
         this.ingredients = ingredients;
         this.instructions = instructions;
         this.calories = calories;
         this.isHealthy = isHealthy;
     }
 
     // Override toString method to display recipe details
     @Override
     public String toString() {
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
 
     // Override toString method to include Halal prefix
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
 
     // Override toString method to include Vegetarian prefix
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
 
     // Override toString method to include Non-Vegetarian prefix
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
 
     // Override toString method to include Vegan prefix
     @Override
     public String toString() {
         return "Vegan " + super.toString();
     }
 }
 
 // Main class to manage recipes
 public class RecipeManager {
     private static ArrayList<BaseRecipe> recipes = new ArrayList<>();
 
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
             System.out.println("8. Exit");
             System.out.print("Choose an option: ");
             int choice = scanner.nextInt();
             scanner.nextLine();  // Consume newline
 
             // Handle menu choice
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
                     System.out.println("Exiting...");
                     return;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
     }
 
     // Method to add a new recipe
     private static void addRecipe(Scanner scanner, String type) {
         System.out.print("Enter recipe name: ");
         String name = scanner.nextLine();
 
         System.out.print("Enter ingredients (comma separated): ");
         String ingredients = scanner.nextLine();
 
         System.out.print("Enter instructions: ");
         String instructions = scanner.nextLine();
 
         System.out.print("Enter calories: ");
         int calories = scanner.nextInt();
         scanner.nextLine();  // Consume newline
 
         System.out.print("Is the recipe healthy (true/false)? ");
         boolean isHealthy = scanner.nextBoolean();
         scanner.nextLine();  // Consume newline
 
         // Create a new recipe based on type
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
 
     // Method to view all recipes
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
 
     // Method to update an existing recipe
     private static void updateRecipe(Scanner scanner) {
         System.out.print("Enter the recipe name to update: ");
         String name = scanner.nextLine();
 
         BaseRecipe recipeToUpdate = null;
         for (BaseRecipe recipe : recipes) {
             if (recipe.name.equalsIgnoreCase(name)) {
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
             scanner.nextLine();  // Consume newline
 
             System.out.print("Is the recipe healthy (true/false)? ");
             boolean isHealthy = scanner.nextBoolean();
             scanner.nextLine();  // Consume newline
 
             // Update recipe details
             recipeToUpdate.ingredients = ingredients;
             recipeToUpdate.instructions = instructions;
             recipeToUpdate.calories = calories;
             recipeToUpdate.isHealthy = isHealthy;
 
             System.out.println("Recipe updated successfully!");
         } else {
             System.out.println("Recipe not found.");
         }
     }
 
     // Method to delete a recipe
     private static void deleteRecipe(Scanner scanner) {
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
 }
 