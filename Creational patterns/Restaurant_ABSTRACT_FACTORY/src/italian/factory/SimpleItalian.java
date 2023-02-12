package italian.factory;

import abstracts.factory.Food;

public class SimpleItalian implements Food {

    @Override
    public String foodOrdered() {
        return "YOU have ordered BOTTARGA and PIZZA.......";
    }
}
