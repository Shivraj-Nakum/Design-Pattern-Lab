package abstracts.factory;


import italian.factory.ItalianFactory;
import mexican.factory.MexicanFactory;

public class Abs_Factory_builder {

    public static FoodType getFoodType( String str){

        if (str.equalsIgnoreCase("ITALIAN")){
            return new ItalianFactory();
        } else if (str.equalsIgnoreCase("MEXICAN")) {
            return new MexicanFactory();
        }
        return null;
    }
}
