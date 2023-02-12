package italian.factory;

import abstracts.factory.Food;

public class BestItalian implements Food {

    @Override
    public String foodOrdered() {
        return "YOU have ordered the exotic LASAGNA.......";
    }
}
