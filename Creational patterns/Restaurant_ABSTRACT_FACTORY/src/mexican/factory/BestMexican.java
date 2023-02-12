package mexican.factory;

import abstracts.factory.Food;

public class BestMexican implements Food {
    @Override
    public String foodOrdered() {
        return "YOU have ordered the exotic CHILAQUILES.......";
    }
}
