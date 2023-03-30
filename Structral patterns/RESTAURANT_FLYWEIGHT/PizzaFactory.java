import java.util.HashMap;

public class PizzaFactory {

   private static final HashMap hm = new HashMap();

   public static Recipe getPizza(String toppings) {
      Pizza p = (Pizza)hm.get(toppings);
 
      if(p == null) {
         p = new Pizza(toppings);
          hm.put(toppings, p);
         System.out.println("Creating Pizza of toppings :  " + toppings);
       }
      return p;
   }
}
