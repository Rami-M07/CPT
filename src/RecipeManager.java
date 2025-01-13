/**
 * author: Rami Maarouf
 * date: 01/10/2024
 * Recipe Manager 
 */

import java.util.ArrayList;
import java.util.Scanner;

class Recipe {
    String name;
    String ingredients;
    String instructions;
    int calories;
    boolean isHealthy;

    public Recipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
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

class HalalRecipe extends Recipe {
    public HalalRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }

    @Override
    public String toString() {
        return "Halal " + super.toString();
    }
}

class VegetarianRecipe extends Recipe {
    public VegetarianRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }

    @Override
    public String toString() {
        return "Vegetarian " + super.toString();
    }
}

class NonVegetarianRecipe extends Recipe {
    public NonVegetarianRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }

    @Override
    public String toString() {
        return "Non-Vegetarian " + super.toString();
    }
}

class VeganRecipe extends Recipe {
    public VeganRecipe(String name, String ingredients, String instructions, int calories, boolean isHealthy) {
        super(name, ingredients, instructions, calories, isHealthy);
    }

    @Override
    public String toString() {
        return "Vegan " + super.toString();
    }
}

public class RecipeManager {
    private static ArrayList<Recipe> recipes = new ArrayList<>();
  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nRecipe Manager");
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

            switch (choice) {
                case 1:
                    addRecipe(scanner);
                    break;
                case 2:
                    viewRecipes();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addRecipe(Scanner scanner) {
        System.out.print("Enter recipe name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ingredients (comma separated): ");
        String ingredients = scanner.nextLine();
        System.out.print("Enter instructions: ");
        String instructions = scanner.nextLine();
        System.out.print("Enter calories: ");
        int calories = scanner.nextInt();
        System.out.print("Is the recipe healthy (true/false)? ");
        boolean isHealthy = scanner.nextBoolean();
        scanner.nextLine();  
        Recipe recipe = new Recipe(name, ingredients, instructions, calories, isHealthy);
        recipes.add(recipe);
        System.out.println("Recipe added successfully!");
    }

    private static void viewRecipes() {
        if (recipes.isEmpty()) {
            System.out.println("No recipes available.");
        } else {
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
                System.out.println("-------------------------");
            }
        }
    }
}