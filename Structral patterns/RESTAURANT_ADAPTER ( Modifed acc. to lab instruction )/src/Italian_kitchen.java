
public class Italian_kitchen implements NewRecipe{
    @Override
    public void cookMexican(String dishName) {
        //do nothing
    }

    @Override
    public void cookItalian(String dishName) {
        System.out.println("Cooking Italian food " + ", " + "DishName: " + dishName);
    }
}
