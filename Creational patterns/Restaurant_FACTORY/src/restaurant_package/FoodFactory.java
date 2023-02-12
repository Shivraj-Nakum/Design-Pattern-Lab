package restaurant_package;

public class FoodFactory {

    public hotel getInstance(String str){
        if (str.equals("pizza")) {
            return new Pizza();
        } else if (str.equals("burger")) {
            return new Burger();
        } else {
            return new Sandwich();
        }
    }
}
