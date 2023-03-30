public class Pizza implements Recipe {
    private String toppings;

 
    public Pizza(String toppings){
       this.toppings = toppings;		
    }
 
    @Override
    public void food() {
       System.out.println("Pizza with " +toppings);
    }
} 


