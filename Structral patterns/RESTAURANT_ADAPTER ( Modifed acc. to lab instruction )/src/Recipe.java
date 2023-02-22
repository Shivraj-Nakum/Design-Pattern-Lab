
public class Recipe implements Food {

    RecipeAdapter recipeAdapter;

    @Override
    public void cook(String cuisine, String dishName) {

        //inbuilt food of Dal-Roti
        if (cuisine.equalsIgnoreCase("normal")){
            System.out.println("Cooking normal food " + ", " + "DishName: " + dishName);
        } else if (cuisine.equalsIgnoreCase("mexican") || cuisine.equalsIgnoreCase("italian")) {
            recipeAdapter = new RecipeAdapter(cuisine);
            recipeAdapter.cook(cuisine,dishName);
        }else {
            System.out.println("invalid cuisine " + dishName + " not available");
        }

    }
}
