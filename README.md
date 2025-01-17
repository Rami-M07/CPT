# RecipeManager by Rami Maarouf!

# Explanation of application or code:

This program is designed to help users to organize their recipes. The user is able to update, add, delete, and view their recipes! They can have different types of recipes such as Vegetarian, NonVegetarian, Vegan, and Halal. If the user finds that they love the recipe, they are able to favorite it, and view it later on so that they can remake their favorite dish!

# Method for addRecipe (To add your recipes):

This method takes a Scanner object and a type string as parameters. The user is prompted to enter details about the recipe, including the name, ingredients, instructions, calories, and whether it is healthy. After the user inputs the information, based on the type of recipe (Halal, Vegetarian, Non-Vegetarian, or Vegan), it creates a new recipe object and adds it to the list of recipes.

# Method for viewRecipes (To view the recipes you added):

This method checks if the list of recipes is empty. If not, it goes through the list of recipes and prints out the details of all the recipes the user has added. If the list is empty, it shows a message saying that there are no recipes available as the user has not added a recipe with that specific name. 

# Method to updateRecipe (To update your added recipe):

This method takes a Scanner object as a parameter. It asks the user to enter the name of the recipe they want to update. If the recipe is found, it asks the user to enter the new details (ingredients, instructions, calories, and whether it is healthy) and updates the recipe. If the recipe is not found, it displays a message saying that the recipe was not found for the name they entered.

# Method to deleteRecipe (To delete a recipe you may not like anymore):

This method takes a Scanner object as a parameter. It asks the user to enter the name of the recipe they want to delete. If the name of the recipe is found, it removes the recipe from the list of recipes and shows a success message. If the recipe is not found, it displays a message indicating that the recipe was not found for the name entered

# Method to favoriteRecipe (To have a favorites list for your loved recipes):

This method takes a Scanner object as a parameter. It asks the user to enter the name of the recipe they want to add to their favourites list. If the recipe is found, it adds the recipe to a stack of favorite recipes and shows a success message. If the recipe is not found, it displays a message indicating that the recipe entered was not found.

# Method to viewFavoriteRecipes (To view your favorite recipes):

This method checks if the stack of favorite recipes is empty. If not, it goes through the stack of favorite recipes and prints out the details of each recipe. If the stack is empty, it displays a message saying that there are no favorite recipes available.

# Known issues or limitations
- If user enters for example a letter into the int calories, then the system crashes and must be ran again
- User must be careful when entering recipe name, for example, when entering the recipe name, do not press the space bar after as you will have issues finding the recipe later on

# Credits
- Name: Rami Maarouf
- Grade: 12
- Date completed: 01/17/2025