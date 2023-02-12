package prototype;

public class FoodItem {
    private int price;
    private String Item;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "price=" + price + ", Item='" + Item + '\'' + '}';
    }
}
