/**
 * author: Rami Maarouf
 * date: 01/10/2024
 * Recipe Manager CPT
 */

import java.util.ArrayList;
import java.util.Scanner;

class Recipe {
    String name;
    String ingredients;
    String instructions;
    int calories;

    public Recipe(String name, String ingredients, String instructions, int calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Recipe Name: " + name + "\nIngredients: " + ingredients + "\nInstructions: " + instructions + calories + "\nCalories: ";
    }
}

public class RecipeManager {
    private static ArrayList<Recipe> recipes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nRecipe Manager");
            System.out.println("1. Add Recipe");
            System.out.println("2. View Recipes");
            System.out.println("3. Exit");
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
        Recipe recipe = new Recipe(name, ingredients, instructions, 0);
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
