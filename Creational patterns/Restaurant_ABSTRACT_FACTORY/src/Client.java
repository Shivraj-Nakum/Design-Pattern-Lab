import abstracts.factory.Abs_Factory_builder;
import abstracts.factory.Food;
import abstracts.factory.FoodType;

public class Client {

    public static void main(String[] args) {

        FoodType f = Abs_Factory_builder.getFoodType("italian");

        //SELECT BEST or SIMPLE  food
        Food italian = f.getItalian("best");
        String item = italian.foodOrdered();

//        //SELECT BEST or SIMPLE  food
//        Food mexican = f.getMexican("simple");
//        String item = mexican.foodOrdered();

        System.out.println(item);

    }
}
