
public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();

        order.takeOrder();
        order.prepareOrder();
        order.deliveredOrder();

        // Attempt to transition from an invalid state
        order.deliveredOrder();
    }
}
