import java.util.ArrayList;
import java.util.List;


interface Component{
    void showPrice();
}

class Leaf implements Component{
    int price;
    String name;

    public Leaf(String name , int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price + " Rs" + '\n');
    }
}

class Composite implements Component{

    String name;
    List<Component> items = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com){
        items.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c : items){
            c.showPrice();
        }
    }
}