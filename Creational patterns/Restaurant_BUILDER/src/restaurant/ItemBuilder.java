package restaurant;

public class ItemBuilder {
    String pizza;
    String sandwich;
    String burger;

    public ItemBuilder setPizza( String pizza){
        this.pizza = pizza;
        return this;
    }
    public ItemBuilder setSandwich( String sandwich){
        this.sandwich = sandwich;
        return this;
    }

    public ItemBuilder setBurger( String burger){
        this.burger = burger;
        return this;
    }
    public Item getItem(){
        return new Item(pizza , sandwich , burger);
    }
}
