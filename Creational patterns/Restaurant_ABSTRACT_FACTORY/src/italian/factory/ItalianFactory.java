package italian.factory;

import abstracts.factory.Food;
import abstracts.factory.FoodType;

public class ItalianFactory implements FoodType {

    @Override
    public Food getItalian(String ita) {
        if (ita == null){
            return null;
        }

        if(ita.equalsIgnoreCase("simple")){
            return new SimpleItalian();
        }

        else if (ita.equalsIgnoreCase("best")){
            return new BestItalian();
        }
        return null;
    }

    @Override
    public Food getMexican(String mex) {
        return null;
    }
}
