
public class RecipeAdapter implements Food{

    NewRecipe newRecipe;

    public RecipeAdapter(String cuisine){
        if (cuisine.equalsIgnoreCase("mexican")){
            newRecipe = new Mexican_kitchen();
        } else if (cuisine.equalsIgnoreCase("italian")) {
            newRecipe = new Italian_kitchen();
        }
    }

    @Override
    public void cook(String cuisine, String dishName) {
        if (cuisine.equalsIgnoreCase("mexican")){
            newRecipe.cookMexican(dishName);
        } else if (cuisine.equalsIgnoreCase("italian")) {
            newRecipe.cookItalian(dishName);
        }

    }
}
