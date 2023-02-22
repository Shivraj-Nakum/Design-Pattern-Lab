
public class Mexican_kitchen implements NewRecipe{

    @Override
    public void cookMexican(String dishName) {
        System.out.println("Cooking Mexican food " + ", " + "DishName: " + dishName);
    }

    @Override
    public void cookItalian(String dishName) {
        //do nothing
    }
}
