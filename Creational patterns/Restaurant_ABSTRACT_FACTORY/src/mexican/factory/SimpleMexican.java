package mexican.factory;

import abstracts.factory.Food;

public class SimpleMexican implements Food {
    @Override
    public String foodOrdered() {
        return "YOU have ordered MEXICAN_RICE and CHILS_EN_NOGADA....... ";
    }
}
