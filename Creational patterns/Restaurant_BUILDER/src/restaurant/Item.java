package restaurant;

public class Item {
    String pizza;
    String sandwich;
    String burger;
    public Item(String pizza , String sandwich , String burger ){
        super();
        this.pizza = pizza;
        this.sandwich = sandwich;
        this.burger = burger;
    }

    public String toString(){
        return "Item [ pizza = " + pizza + " , sandwich = " + sandwich + " , burger = " + burger + "] ";
    }
}
