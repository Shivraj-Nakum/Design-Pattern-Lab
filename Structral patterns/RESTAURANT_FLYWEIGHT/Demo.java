
public class Demo {
    private static final String choice[] = { "Mushrooms", "Peppers", "Pepperoni" };
    public static void main(String[] args) {
 
       for(int i=0; i < 10; ++i) {
          Pizza p = (Pizza)PizzaFactory.getPizza(getRandomChoice());
          p.food();
       }
    }
    private static String getRandomChoice() {
       return choice[(int)(Math.random()*choice.length)];
    }
 }
