package mexican.factory;

import abstracts.factory.Food;
import abstracts.factory.FoodType;
import italian.factory.BestItalian;
import italian.factory.SimpleItalian;

public class MexicanFactory implements FoodType {

    @Override
    public Food getMexican(String mex) {
        if (mex == null){
            return null;
        }

        if(mex.equalsIgnoreCase("simple")){
            return new SimpleMexican();
        }

        else if (mex.equalsIgnoreCase("best")){
            return new BestMexican();
        }
        return null;
    }

    @Override
    public Food getItalian(String ita) {
        return null;
    }
}
