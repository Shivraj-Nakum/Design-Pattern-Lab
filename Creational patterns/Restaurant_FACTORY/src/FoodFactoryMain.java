import restaurant_package.FoodFactory;
import restaurant_package.hotel;

public class FoodFactoryMain {

    public static void main(String[] args) {
        FoodFactory osf = new FoodFactory();

        hotel obj = osf.getInstance("sandwich");
        obj.eat();

    }

}
