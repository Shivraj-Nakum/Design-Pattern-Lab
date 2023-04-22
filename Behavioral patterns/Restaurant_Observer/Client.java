
public class Client {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder();

        new OrderConfirmed(restaurantOrder);
        new OrderDelivered(restaurantOrder);
        new OrderCancelled(restaurantOrder);


        restaurantOrder.setOrder(1);

    }
}